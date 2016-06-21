// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 5_1

import java.util.Scanner;

public class StringMethods {

   public static void main(String[] args){
      
      //Declare Scanner class
      //And Variables
      Scanner input = new Scanner(System.in);
      String string_1;
      String string_2;
      
      //Prompt User for Input
      System.out.print("Enter a value for string_1 at least 5 characters long: ");
      string_1 = input.nextLine();
      System.out.print("Enter a value for string_2: ");
      string_2 = input.nextLine();
      
      //Part A and B
      //Determine Length of String_1
      //And String_2
      int length_1 = string_1.length();
      int length_2 = string_2.length();
      
      //Output these results
      System.out.println("The length of string_1 is " + length_1);
      System.out.println("The length of string_2 is " + length_2);
      
      //Part C: Concantenate both strings
      String conc_1 = string_1.concat(string_2);
      String conc_2 = string_2.concat(string_1);
      
      //Output the results
      System.out.println("String_2 concatenated to string_1 is " + conc_1);
      System.out.println("String_1 concatenated to string_2 is " + conc_2);
      
      //Part D: Check if the two strings
      //Have the same set of characters
      System.out.println("The two Strings are equal: " + string_1.equals(string_2));
      
      //Part E: Convert string_1 to upper case
      System.out.println("String_1 converted to uppercase is: " + string_1.toUpperCase());
      
      //Part F: Convert string_2 to lower case
      System.out.println("String_2 converted to lowercase is: " + string_2.toLowerCase());
      
      //Part G: Extract a sub-string of 
      //Multiple characters from string_1
      System.out.println("A multiple character sub-string of string_1 is " 
                           + string_1.substring(2, 5));
   }
}