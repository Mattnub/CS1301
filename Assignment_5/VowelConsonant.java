// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 5_4

import java.util.Scanner;

public class VowelConsonant{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      //Ask user for their input
      System.out.print("Enter a letter: ");
      //Find their input at index 0
      char letter = input.next().charAt(0);
      //Convert this character to lower case
      char newLetter = Character.toLowerCase(letter);
      
      //Create switch to check for vowels
      switch(newLetter){
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
            System.out.println(letter + " is a vowel");
         break;
         //If input doesn't match it is either invalid or a consonant   
         default:
            //If the character input is a letter run this
            if (Character.isLetter(letter)){
               System.out.println(letter + " is a consonant");
            }
            //Otherwise it is not a valid input
            else{
               System.out.println(letter + " is not a valid input");
            }
         break;   
      }
   }
}