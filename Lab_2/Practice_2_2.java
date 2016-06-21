// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_2

//Import Scanner class
import java.util.Scanner;

public class Practice_2_2{
   
   public static void main(String[] args){
  
      //Declares scanner class
      Scanner s = new Scanner(System.in);
      
      //Prompt user for input
      System.out.println("Provide a floating-point number for variables R and T");
      System.out.print("R: ");
      double r = s.nextDouble();
      System.out.print("T: ");
      double t = s.nextDouble();
      
      //Prints the values of the variables
      System.out.println("R = " + r);
      System.out.println("T = " + t);
      
      //Finds the sum, difference, and product
      System.out.println("The sum of R and T = " + (r + t));
      System.out.println("The difference of R and T = " + (r - t));
      System.out.println("The product of R and T = " + (r * t));
   }
}