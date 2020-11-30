/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.darray;

import java.util.NoSuchElementException;

/**
 * A dynamic array implementation
 * 
 * @param <E> the element type
 */
public class DynamicArray<E> implements DArray<E> {

	public static final int INITIAL_CAPACITY = 64;
        
        private E[] array;
        private int size;
        private int capacity;
        


	@SuppressWarnings("unchecked")
	public DynamicArray() {
            
            
            if(capacity<=0)
            {
                throw new IllegalArgumentException("Wrong Capacity");
            }
            this.array=(E[]) new Object[capacity];
            this.size=0;
            
        }


	@Override
	public E get(int index) {
            
            if(isEmpty())
            {
                throw new NoSuchElementException();
            }
            
            if(index<0 || index>size)
            {
                throw new NoSuchElementException();
            }

		return this.array[index];
	}


	@Override
	public void put(int index, E value) {
            
		if(index<0 || index>size)
            {
                throw new NoSuchElementException();
            }
                
            this.array[index]=value;
		
	}


	@Override
	public void add(E value) {
            
		if(size>=array.length)
                {
                    doubleCapacity();
                }
                //size++;
                //array[size]=elem;
                array[++size]=value;
		
	}


	@Override
	public void addAt(int index, E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public void clear() {
            
            for(int i=1;i<=size;i++)
            {
               array[i]=null;
            }
            size=0;
		
	}
        
        private void doubleCapacity(){
            int newCapacity=2*array.length;
            E[] newArray =(E[]) new Object[newCapacity];

            for(int i=1; i<=INITIAL_CAPACITY;i++){
                newArray[i]=array[i];
            }

            array=newArray;
        
                
        }

	

}
