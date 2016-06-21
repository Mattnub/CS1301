// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 2_4

import java.util.Scanner;

public class Distance{
   
   public static void main (String[] args){
      
      //Declare Variables
      double x1;
      double x2;
      double y1;
      double y2;
      double distance;
      
      //Declare Scanner class
      Scanner s = new Scanner(System.in);
      
      //Prompt user for input
      System.out.print("Enter a value for x1 and y1: ");
      x1 = s.nextDouble();
      y1 = s.nextDouble();
      System.out.print("Enter a value for x2 and y2: ");
      x2 = s.nextDouble();
      y2 = s.nextDouble();
      
      //Compute the distance
      distance = Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2);
      double rootDistance = Math.pow(distance, 0.5);
      
      //Output the distance to the user
      System.out.println("The distance between the two points is " + rootDistance);
      
   }
}