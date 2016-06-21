// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 2_1

public class Cylinder {

   public static void main(String[] args){
   
      //Declare variables
      double radius = 5.5;
      double pi = 3.14159;
      double length = 12;
      
      //Compute and assign reults a variable
      double area = radius * radius * pi;
      double volume = area * length;
      
      //Print the results
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
   }
}