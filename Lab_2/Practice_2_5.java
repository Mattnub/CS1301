// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_5

//Import Scanner class
import java.util.Scanner;

public class Practice_2_5{

   public static void main(String[] args){
      
      //Declare Scanner class
      Scanner s = new Scanner(System.in);
      
      //Ask User for input
      System.out.println("How many quarters are in the jar?");
      int quarter = s.nextInt();
      System.out.println("How many dimes are in the jar?");
      int dime = s.nextInt();
      System.out.println("How many nickels are in the jar?");
      int nickel = s.nextInt();
      System.out.println("How many pennies are in the jar?");
      int penny = s.nextInt();
      
      //Sort and print out the input from User
      System.out.println("\n");
      System.out.println(quarter + " quarters.");
      System.out.println(dime + " dimes.");
      System.out.println(nickel + " nickels.");
      System.out.println(penny + " pennies.");
      
      //Declare Variables for after User Input
      //Multiply by their Cent value then add them up
      int quarterMath = quarter * 25;
      int dimeMath = dime * 10;      
      int nickelMath = nickel * 5;
      int mainMath = quarterMath + dimeMath + nickelMath + penny;
      
      //Declare Dollar and Cent variables
      //Divide by 100 to get dollar value
      //Divide for remainder to get cent value      
      int dollar = mainMath / 100;
      int cents = mainMath % 100;
      
      //Print out Values in Dollar and Cents to User
      System.out.println("\n");
      System.out.println("There is " + dollar + " dollars and "
                          + cents + " cents in the jar.");
      
      
      
   }
}