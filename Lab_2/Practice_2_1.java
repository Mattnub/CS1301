// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_1

//Import the Scanner class
import java.util.Scanner;

public class Practice_2_1{
   
   public static void main (String[] args){
      //Declare Scanner class
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a value for x: "); //Prompt user for value of X
      //Tells computer to read input as an integer
      int x = s.nextInt();      
      
      System.out.print("Enter a value for y: "); //Prompt user for value of Y
      int y = s.nextInt();
      
      System.out.print("Enter a value for z: "); //Prompt user for value of Z
      int z = s.nextInt();
      
      //Prints out the values
      System.out.println("X = " + x);
      System.out.println("Y = " + y);
      System.out.println("Z = " + z);
      
      //Adds the variables and finds the average
      System.out.println("The average of these numbers = " + (x + y + z)/3);
   }
}