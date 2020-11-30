/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hua.it21996;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author artemis
 */
public class Company{
    
    
    public static final int CIVILIAN=0;
    public static final int STUDENT=1;
    public static final int PROFESSIONAL=2;
    
    private int userVatNumber;
    private String userId;
    
    
    
    ArrayList<Customer> customerList=new ArrayList<Customer>();
    
    
    public void Menu()
    {
        System.out.printf("\tPlease choose an option from 1 to 6\n");
        System.out.printf("\t1.Create A New Costumer\n");
    }
    
    public void addCustomer()
    {
        Customer userCust= new Customer();
        
        Scanner customerInfo= new Scanner(System.in);
         
        //VAT CUSTOMER
        System.out.printf("\tPlease enter your Vat.\n");
        this.userVatNumber=customerInfo.nextInt();

        //ID CUSTOMER
        System.out.printf("\tPlease enter your identity number.\n");
        this.userId=customerInfo.next();
                
        if(this.findVat(this.userVatNumber)==null && this.findId(this.userId)== null)
        {
            System.out.printf("\tThis customer already exist.Please try something else\n");
            return;
        }
        
        
        //ADDRESS CUSTOMER
        System.out.printf("\tPlease enter your address.\n");
        userCust.setAddress(customerInfo.next());
        
        //PROPERTY CUSTOMER
        System.out.printf("\tPlease enter your property.\n"
        + "for civilian press 0 \n for student press 1\n "
        + "for professional press 2\n");
        
        switch(customerInfo.nextInt()) 
        {
            case 1:
                userCust.setProperty(CIVILIAN);
                break;
            case 2:
                userCust.setProperty(STUDENT);
                break;
            case 3:
                userCust.setProperty(PROFESSIONAL);
                break;
            default:
                System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
                break;
        }
        
        //EMAIL CUSTOMER
        System.out.printf("\tPlease enter your email.\n");
        userCust.setEmail(customerInfo.next());

        userCust.setDiscountAmount(0);

        customerList.add(userCust);
        
        
    }
     
    public Customer findVat(int userVat)
    {
        Customer current;
                
        for (int i=0;i<customerList.size();i++) {
            current = customerList.get(i);
            if(current.getVatNumber()==userVat){
                return current;
            }
           
        }
        return null;
    }
    
    public Customer findId(String userId)
    {
        Customer current;
                
        for (int i=0;i<customerList.size();i++) 
        {
            current = customerList.get(i);
            if(current.getId().compareTo(userId)== 0)
            {
                return current;
            }
        }
        return null;
    }
    
    
        
}
