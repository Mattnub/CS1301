//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_4_3

import java.util.Scanner;

public class TestOperators{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      //Declare variables
      int num1 = 5;
      int num2 = 6;
      int input;
      //Ask user for integer input
      System.out.print("Enter an integer: ");
      input = s.nextInt();
      //Print out 3 lines checking if the remainder equals 0
      //If both equal 0 then both are divisible
      //If one or the other then one is divisible
      //If one exclusive to the other then one is and one isn't
      System.out.println("Is the number divisible by 5 and 6? " 
                        + (input % 5 == 0 && input % 6 == 0));
      System.out.println("Is the number divisible by 5 or 6? " 
                        + (input % 5 == 0 || input % 6 == 0));
      System.out.println("Is the number divisible by 5 or 6, but not both? "
                        + (input % 5 == 0 ^ input % 6 == 0)); 
   }
}
