// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 3_5

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    //Prompt user for input
    System.out.print("Enter a three-digit integer: ");
    int number = input.nextInt();
    
    //Check if Palindrome
    //Output results
    if (number / 100 == number % 10)
      System.out.println(number + " is a palindrome");
    else 
      System.out.println(number + " is not a palindrome");
  }
}
