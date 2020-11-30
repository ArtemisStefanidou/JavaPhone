/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hua.it21996;

import java.util.ArrayList;
import java.util.Scanner;
import static org.hua.it21996.Customer.CIVILIAN;
import static org.hua.it21996.Customer.PROFESSIONAL;
import static org.hua.it21996.Customer.STUDENT;

/**
 *
 * @author artemis
 */
public class it21996 {
    
    public static void main(String[] args)
    {
        Company userComp= new Company();
        
        userComp.Menu();
       
        System.out.println("Only one number please.");
        Scanner choice = new Scanner(System.in);
        
        
        switch(choice.nextInt()) 
        {
            case 1:
               
                userComp.addCustomer();
            
                break;
            case 2:
              // code block
              break;
            default:
              // code block
        }
        
    }
}
