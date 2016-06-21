// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_4

//imports scanner class
import java.util.Scanner;

public class Practice_2_4{

   public static void main(String[] args){
      
      //Declares scanner class
      Scanner s = new Scanner(System.in);
      
      //Prompt user for an integer input
      System.out.print("Enter an integer length of a square: ");
      //Checks the input value
      int x = s.nextInt();
      System.out.println("The square has a length of: " + x);
      
      //Finds the area of the square
      System.out.println("The area of the square is: " + (x * x));
      //Finds the perimeter of the square
      System.out.println("the perimeter of the square is: " + (x * 4));
   }
}