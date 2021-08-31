
package finalassignment;

import java.util.Scanner;
public class Run extends Employee{
    
     public static void main(String[] args) {
        
        int c; 
        String d;
         Scanner input = new Scanner (System.in);
         
         
         System.out.println("\t      UCB BANK");
         System.out.println("\t 1. Employee");
         System.out.println("\t 2. User");
         System.out.print("\t Enter A Choise:");
         c  = input.nextInt();
         
         switch (c)
         {
             case 1:
                 
                 System.out.println("*******************************************\n");
                  System.out.print("\t Enter Name: ");
                  d = input.next();
                  System.out.print("\t Enter ID:");
                  c  = input.nextInt();
                  
                  if (d == employeename){
                      System.out.println("sdfsadf");
                  }
                  
                 break;
                 
                 
                 
                 
             case 2:
                 System.out.println("*******************************************\n");
                 System.out.println(" \t      USER ACCOUNT \n");
                 System.out.println("\t 1. Cash Withdrawal");
                 System.out.println("\t 2. Make a Deposit ");
                 System.out.println("\t 3. Transfer Money ");
                 System.out.println("\t 4. Balance ");
                 break;
             default :
                 System.out.println("Not A Valid Digit");
         }
    }

  
}
