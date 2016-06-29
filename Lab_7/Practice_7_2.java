//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_7_2

import java.util.Scanner;

public class Practice_7_2{

   public static void main(String[] args){
      //Declare variables and Scanner
      Scanner input = new Scanner(System.in);
      int wordCount = 1;
      //Prompt user for input and store it
      System.out.print("Enter a sentence: ");
         String userInput = input.nextLine();
      //Output the user intput   
      System.out.print("Entered String: " + userInput);   
      //Store string to an array that stops at spaces
      String[] array = userInput.split(" ");
      //loop the array until you reach the end of the string
      for(int i = 0; i < array.length; i++, wordCount++)
         System.out.print("\nWord #" + wordCount + ": " + array[i]);
   }
}