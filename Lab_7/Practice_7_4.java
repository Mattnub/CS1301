//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_7_4

import java.util.Scanner;

public class Practice_7_4{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      //Ask for user input
      System.out.print("Enter a string: ");
         //Store User input
         String userInput = input.nextLine();
            //Convert to lower case
            userInput = userInput.toLowerCase();
            //Create an array to count through the letters in the string 
            int[] allLetters = new int[26];
            for(int i = 0; i < userInput.length(); i++){
               //assign the variable character to the input at the set increment
               char letter = userInput.charAt(i);
               //convert that letter into an integer value
               int value = (int)letter;
               //make sure it is valid and then store it
               //increment when you have double
               if(value >= 97 && value <= 122){
                  allLetters[value - 'a']++;
               }
            }
      //Create for loop to output the results
      for(int i = 0; i < allLetters.length; i++){
         //if the letters have a value do this code
         if(allLetters[i] > 0){
            //cast the int value into a character
            char letter = (char)(i+97);
            //output the results until all letters are output
            System.out.println(letter + " : " + allLetters[i]);
         
         }
         
      }      
   }
}