// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 2_2

import java.util.Scanner;

public class Kilograms{

   public static void main (String[] args){
      
      //Declare Scanner class
      Scanner s = new Scanner(System.in);
      
      //Prompt user for pounds value
      System.out.print("Enter a number in pounds: ");
      double pound = s.nextDouble();
      
      //Compute kilograms with User input
      double kilogram = pound * 0.454;
      
      //Output results
      System.out.println(pound + " pounds is " + kilogram + " kilograms.");
   }
}