// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 2_3

import java.util.Scanner;

public class SumDigits {

   public static void main(String[] args){
      //Declare Scanner class
      Scanner s = new Scanner(System.in);
      
      //Ask user for input
      System.out.print("Enter a number between 0 and 1000: ");
      int num = s.nextInt();
      
      //Find all digits in number
      int lastDigit = num % 10;
      int bigNumber = num / 10;
      int secondDigit = bigNumber % 10;
      bigNumber = bigNumber / 10;
      int thirdDigit = bigNumber % 10;

      // Obtain the sum of all digits
      int sum = lastDigit + secondDigit + thirdDigit;

      // Display results
      System.out.println("The sum of all digits in " + num + " is " + sum);
 
   }
}