// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 3_1

//Import Scanner Class
import java.util.Scanner;

public class CheckNumber{

   public static void main(String[] args){
   
      //Declare Scanner Class
      Scanner s = new Scanner(System.in);

      //Ask user for input
      System.out.println("Please enter an even or odd integer to evaluate.");
      int num = s.nextInt();

      //Evaluate input and output result
      if (num > 0){
         System.out.println("The number " + num + " is positive.");
      }      
      else if (num < 0){
         System.out.println("The number " + num + " is negative.");
      }
      else{
         System.out.println("The number " + num + " is zero.");
      }
   }
}
