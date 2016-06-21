// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_6

import java.util.Scanner;

public class Practice_2_6{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter a starting velocity in meters/second: ");
      double v1 = s.nextDouble();
      System.out.println("Enter an ending velocity in meters/second: ");
      double v2 = s.nextDouble();
      System.out.println("Enter a time span in seconds: ");
      double time = s.nextDouble();
      System.out.println("\n");
      
      double acceleration = (v1 - v2)/time;
      
      System.out.println(acceleration + " meters per second.");
   }
}