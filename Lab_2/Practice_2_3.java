// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: Lab_2_3

import java.util.Scanner;

public class Practice_2_3{
   
   public static void main(String[] args){
      
      //declare variables
      byte byte_value;
      short short_value;
      int int_value;
      long long_value;
      float float_value;
      double double_value;
      
     
      Scanner s = new Scanner(System.in);
      //Ask user for a byte value
      System.out.print("Enter byte value:\t");
      //Checks if value is a byte
      byte_value = s.nextByte();
      //Prints byte value
      System.out.println("\n");
      System.out.println("The byte value is:\t" + byte_value);
      
      //Ask user for short value
      System.out.print("Enter a short value:\t");
      //Check if input is a short
      short_value = s.nextShort();
      //Prints the short value
      System.out.println("\n");
      System.out.println("The short value is:\t" + short_value);
      
      //Ask user for an integer
      System.out.print("Enter an int value:\t");
      //Check if input is an integer
      int_value = s.nextInt();
      //Prints the value of the integer
      System.out.println("\n");
      System.out.println("The int value is:\t" + int_value);
      
      //Ask user for a long value
      System.out.print("Enter a long value:\t");
      //Check if input is a long
      long_value = s.nextLong();
      //Prints the long value
      System.out.println("\n");
      System.out.println("The long value is:\t" + long_value);
      
      //Ask use for a float
      System.out.print("Enter a float value:\t");
      //Check if input is a float
      float_value = s.nextFloat();
      //Prints the float value
      System.out.println("\n");
      System.out.println("The float value is:\t" + float_value);
      
      //Ask user for a double
      System.out.print("Enter a double:\t");
      //Check if input is a double
      double_value = s.nextDouble();
      //Prints the value of the double
      System.out.println("\n");
      System.out.println("The double value is:\t" + double_value);
      
   }
}