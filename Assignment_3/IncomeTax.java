// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 3_2

import java.util.Scanner;

public class IncomeTax{

   public static void main(String[] args){
      //Prompt the user for a value
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your annual income: ");
      int income = s.nextInt();
                  
      //Check income with if else statement
      //Evaluate if income is less than or equal to 50k
      if (income <= 50000){
         System.out.println("Your income is $" + income + "; your tax bracket is 5%.");
      }
      //Evaluate if 50k is less than income AND income is less than or equal to 100k
      else if (50000 < income && income <= 100000){
         System.out.println("Your income is $" + income + "; your tax bracket is 15%.");
      }
      //Evaluate if 100k is less than income AND income is less than or equal to 150k
       else if (100000 < income && income <= 150000){
         System.out.println("Your income is $" + income + "; your tax bracket is 20%.");
      }
      //Evaluate if 150k is less than income AND income is less than or equal to 250k
       else if (150000 < income  && income <= 250000){
         System.out.println("Your income is $" + income + "; your tax bracket is 30%.");
      }
      //Evaluate if 250k is less than income AND income is less than or equal to 500k
       else if (250000 < income && income <= 500000){
         System.out.println("Your income is $" + income + "; your tax bracket is 35%.");
      }
      //Evaluate if 500k is less than income
       else if (500000 < income) {
         System.out.println("Your income is $" + income + "; your tax bracket is 50%.");
      }
      //If none are true tell user to enter and integer value
       else {
         System.out.println("That is not a valid input. Please enter an integer.");
       }

   }
}