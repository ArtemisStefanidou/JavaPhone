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
public class LandlineContract extends Contract{
    
    public static final int ADSL=0;
    public static final int VDSL=1;
    
    private int speedBooster;
    
    Scanner choice = new Scanner(System.in);
    
    //Two methods for if customer wants internet and with what speed
    public void chooseWantSpeed()
    {
        
        System.out.printf("Do you want to have internet with the landline "
                        + "phone?\nYes or No?\n");
       
        switch(choice.next().toUpperCase()) 
                {
                    case "YES":
                        chooseNameSpeed();
                        break;
                    case "NO":
                        this.speedBooster=0;
                        break;
                    default:
                        System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
                        break;
                        
                }
        
    }
    
    public void chooseNameSpeed()
    {
        System.out.println("Do you want VDSL or ADSL?");
            switch(choice.next().toUpperCase()) 
            {
                case "VDSL":
                    this.speedBooster=VDSL;
                    break;
                case "ADSL":
                    this.speedBooster=ADSL;
                    break;
                default:
                    System.out.printf("\n\tChoice is not correct.Please try something different\n\n");
                    break;
            }
    }
    
    @Override
    public String toString()
    {
        return String.format("\t\t\t\tContracts Info\t\t\t\t\n"
                + "Code\tStart\tDuration\tCost/month\tType Account\t"
                + "Payment Way\tPhone Num\tDiscount\nSpeed\n"
                + "%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                   LandlineContract.super.getPhoneNumber());
    }
    
}
