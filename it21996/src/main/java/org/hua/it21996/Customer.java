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
public class Customer {
    
    private int vatNumber;
    private int customerNumber;
    private String address;
    private String id;
    private int property;
    private int discountAmount;
    private String email;
    
    
    private ArrayList<Contract> ContractList;
    
    public Customer()
    {
       ContractList=new ArrayList<Contract>();
    }
    
    public void setAddress(String userAddress)
    {
        
        this.address=userAddress;
    }
    
    public void setVatNumber(int userVatNumber)
    {
        this.vatNumber=userVatNumber;
    }
    
    public void setId(String userId)
    {
        this.id=userId;
    }
    
    public void setProperty(int userProperty)
    {
        this.property=userProperty;
    }
    
    public void setEmail(String userEmail)
    {
        this.email=userEmail;
    }
    
    public void setDiscountAmount(int userDiscountAmount)
    {
        this.discountAmount=userDiscountAmount;
    }
    
    //geters
     public String getAddress()
    {
        return this.address;
    }
    
    public int getVatNumber()
    {
        return this.vatNumber;
    }
    
    public String getId()
    {
        return this.id;
    }
    
    public int getProperty()
    {
        return this.property;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
   
    public void chooseContract()
    {
        System.out.printf("For landline contract press 1\nFor mobile contract press 2\n");
        Scanner choice = new Scanner(System.in);
        
        Scanner customerInfo= new Scanner(System.in);
        
        switch(choice.nextInt()) 
        {
            
                
            case 1:
                
               LandlineContract landContr = new LandlineContract();
              
               //Phone number CUSTOMER
               System.out.printf("\tPlease enter your landline number.\n");
               landContr.setPhoneNumber(customerInfo.nextInt());
                
               //User set the common info of two (Mobile,Landline)contracts
               landContr.setContractInfo();
               ContractList.add(landContr);
               
               //User set speed of internet if he wants to
                landContr.chooseWantSpeeed();
                
                break;
            case 2:
                
               MobileContract modContr = new MobileContract();
            
               //Phone number CUSTOMER
               System.out.printf("\tPlease enter your mobile number.\n");
               modContr.setPhoneNumber(customerInfo.nextInt());
               
               //User set the common info of two (Mobile,Landline)contracts
               modContr.setContractInfo();
               ContractList.add(modContr);
               
               
               
              break;
            default:
                
              System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
              break;
        }
        
        
        
        
        
    }
    
        
        
    


    
}
