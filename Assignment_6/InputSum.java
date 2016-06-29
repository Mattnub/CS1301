// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment_6_1
import java.util.Scanner;
public class InputSum{

   public static void main(String[] args){
      //Declare Variables
      int data;
      int sum = 0;
      String userInput = "";
      
      Scanner input = new Scanner(System.in);
      //Acquire Initial Input
      System.out.print("Enter positive integer value(-1 to cancel): ");
         data = input.nextInt();
       //If input is less than -1
       //Terminate program
         if(data < -1){
            System.out.print("That is not a valid input. Please enter a positive integer.");
            System.exit(1);
         }
      //While input is not -1 do this
      while(data != -1){
      
         //Add data to the sum variable
         sum += data;
         System.out.print("Entered integer: " + data +"\n");
         //Get new input
         data = input.nextInt();
      }    
         //Output results
         System.out.print("\nThe sum: " + sum);
  
   }
}