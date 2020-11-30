/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hua.it21996;

import java.util.Scanner;

/**
 *
 * @author artemis
 */
public class Contract {
    
    
    public static final int ELECTRONIC_ACCOUNT=0;
    public static final int PRINTED_MATTER_ACCOUNT=1; 
    
    
    public static final int CREDIT_CARD=0;
    public static final int CASH=1; 
    public static final int STANDING_ORDER_CARD=2; 
    
    private int contractCode;
    private int startContract;
    private int durationContract;
    private int costPerMonth;
    private int typeAccount;
    private int paymentWay;
    private int phoneNumber;
    
    public void setStartContract()
    {
        System.out.printf("Do you want to start a contract?\n"
                + "Please press 1 to start\n"
                + "or 2 to quit\n");
        Scanner choice = new Scanner(System.in);
        
        switch(choice.nextInt()) 
        {
            case 1:
               
                
            
                break;
            case 2:
              // code block
              break;
            default:
              // code block
        }
        this.startContract=dateToday;
    }
    
    public void setDurationContract(int userDurationContr)
    {
        this.durationContract=userDurationContr;
    }
    
    public void setPhoneNumber(int userPhoneNumber)
    {
        this.phoneNumber=userPhoneNumber;
    }
    
    public void setContractInfo()
    {
        Scanner choice = new Scanner(System.in);
        
        //type account
        System.out.printf("\tPlease enter the duration of this contract.\n"
                + "for electronic account press 0\n"
                + "for printed matter account press 1\n");
        
        switch(choice.nextInt()) 
        {
            case 0:
               
                this.typeAccount=ELECTRONIC_ACCOUNT;
                
                break;
            case 1:
                
              this.typeAccount=PRINTED_MATTER_ACCOUNT;
              
              break;
              
            default:
              System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
              break;
        }
        
        
        //Duration Contract
        System.out.printf("\tPlease enter the duration of this contract.\n"
                + "for 12 months press 0\n"
                + "for 24 months press 1\n");
        switch(choice.nextInt()) 
        {
            case 0:
               
                this.durationContract=12;
                
                break;
            case 1:
                
              this.durationContract=24;
              
              break;
              
            default:
              System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
              break;
        }
        
        //Payment Way
        System.out.printf("\tPlease enter how do you want to pay this contract.\n"
                + "for credit card press 0\n"
                + "for cash  press 1\n"
                + "for standing order card press 2\n");
        switch(choice.nextInt()) 
        {
            case 0:
               
                this.paymentWay=CREDIT_CARD;
                
                break;
            case 1:
                
              this.paymentWay=CASH;
              
              break;
              
            case 2:
                
              this.paymentWay=STANDING_ORDER_CARD;
              
              break;
              
            default:
              System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
              break;
        }
        
        
        
    }
    
}
