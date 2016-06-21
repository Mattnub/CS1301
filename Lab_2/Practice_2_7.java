// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_7

import java.util.Scanner;

public class Practice_2_7{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the airplane's acceleration in meters/second: ");
      double acceleration = s.nextDouble();
      
      System.out.print("Enter the take-off speed in meters/second: ");
      double speed = s.nextDouble();
      
      double length = Math.pow(acceleration, 2)/(2 * speed);
      
      System.out.println("The minimum length of the runway is: " + length);
   }
}