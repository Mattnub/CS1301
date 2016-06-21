// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 3_3

import java.util.Scanner;

public class Phonebill{
   
   public static void main(String[] args){
      //Declare variables and Scanner Class
      Scanner s = new Scanner(System.in);
      char code;
      int account, minutes, nightMinutes, rCharges,
          pChargesDay, pChargesNight;
      double rFinal, pFinal;
      
      
      //Prompt user for their account number
      System.out.println("Please enter your account number");
         account = s.nextInt();
      //Prompt user for their service code
      System.out.println("Please enter your service code(r = regular, p = premium"); 
         code =  s.next().charAt(0);
         
      //If code entered is 'r' run this code
         if (code == 'r'){
            
            //Ask for call duration
            //Compute charges based on requirements
            System.out.println("Please enter the call duration in minutes");
               minutes = s.nextInt();
                   rCharges = (minutes - 50);
                   rFinal = (rCharges * .20);
            //Output results
            System.out.println("Account Number: " + account);
            System.out.println("Service Type: Regular");
            System.out.println("Call Duration(Minutes): " + minutes);
            System.out.println("Amount Due: $" + rFinal);
            
         }
         //If code entered is 'p' run this code
         else if (code == 'p'){
            //Ask for daytime and nighttime minutes
            System.out.println("Please enter the amount of daytime minutes");
               minutes = s.nextInt();
            System.out.println("Please enter the amount of nighttime minutes");
               nightMinutes = s.nextInt();
                  
                  //Compute charges
                  pChargesDay = (minutes - 75);
                  pChargesNight = (nightMinutes - 100);
                  pFinal = (minutes * .10) + (nightMinutes * .05);
            //Output results
            System.out.println("Account Numbers : " + account);
            System.out.println("Service Type: Premium");
            System.out.println("Call Duration(Minutes): " + (minutes + nightMinutes));
            System.out.println("Amount Due: $" + pFinal);
         }
         //If code != 'r' or 'p'
         //Tell user code is invalid
         else{
            System.out.println("That is not a valid service code.");
         }
         
               
              
         
      
      
       
   }
}