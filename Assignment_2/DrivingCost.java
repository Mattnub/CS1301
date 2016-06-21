// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 2_5

import java.util.Scanner;

public class DrivingCost{

   public static void main(String[] args){
      
      //Declare Scanner Class and all Variables
      Scanner s = new Scanner(System.in);
      double distance;
      double mpg;
      double price;
      double mpgMath;
      double cost;
      
      //Prompt user for input
      System.out.print("Enter a driving distance: ");
      distance = s.nextDouble();
      
      System.out.print("Enter miles per gallon: ");
      mpg = s.nextDouble();
      
      System.out.print("Enter price per gallon: ");
      price = s.nextDouble();
      
      //Compute input
      mpgMath = distance / mpg;
      cost = mpgMath * price;
      
      //Output results
      System.out.println("The cost of driving is $" + cost);
      
      
   }
}