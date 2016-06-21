//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Lab_5_3

import java.util.Scanner;

public class ASCII_Code{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      byte input;
      char output;
    
      System.out.print("Enter an ASCII code: ");
      input = s.nextByte();
      
      if (input < 0){
         System.out.print("That is not a valid input");
         System.exit(1);
      }
      
      output = (char)input;
      
      System.out.print("The character for ASCII code " + input + " is " + output);  
   }
}