//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_8_1

import java.util.Scanner;

public class MinMaxAvg{

   public static void main(String[] args){
      //Declare variables
      Scanner scan = new Scanner(System.in);
      int xValue, yValue, zValue, cont;
      //Create a do loop to repeat as long as the user wants
      do{
      //Prompt user for input and store it
      System.out.print("Enter three integer values: ");
      xValue = scan.nextInt();
      yValue = scan.nextInt();
      zValue = scan.nextInt();
      //Call methods to find max,min,average
      int maxValue = max(xValue, yValue, zValue);
      int minValue = min(xValue, yValue, zValue);
      double average = average(xValue, yValue, zValue);
      //Output the results to the User
      System.out.println("You entered: " + xValue + " " + yValue + " " + zValue);
      System.out.println("Max value: " + maxValue);
      System.out.println("Min value: " + minValue);
      System.out.println("Average value: " + average);
      //Ask user if they want to continue
      System.out.println("Do you want to continue?(0 - yes, 1 - no): ");
         cont = scan.nextInt();
      }
      //If they enter 1 terminate the program
      //Otherwise rerun do loop
      while(cont != 1);
   }
   //Declare method for max of the input
   public static int max(int num1, int num2, int num3){
      //Declare result variable
      int result = 0;
      //if num1 is greater than num2 & num3
      //num1 is the max and assign it to result
      if (num1 > num2 && num1 > num3){
         result = num1;
      }
      //else if num2 is greater than num1 & num3
      //num2 is the max and assign it to the result variable
      else if(num2 > num1 && num2 > num3){
         result = num2;
      }
      //Else num3 must be the max
      //Assign num3 to result
      else{
         result = num3;
      }
      //Return result
      return result;
   }
   //Declare method for min of an input
   public static int min(int num1, int num2, int num3){
      //Declare result variable
      int result = 0;
      //If num1 is less than num2 & num3
      //num1 is the min and assign it to result
      if (num1 < num2 && num1 < num3){
         result = num1;
      }
      //else if num2 is less than num1 & num3
      //num2 is the min and assign it to result
      else if(num2 < num1 && num2 < num3){
         result = num2;
      }
      //else num3 must be the min
      //assign it to result
      else{
         result = num3;
      }
      //return the result
      return result;
   }
   //Declare method for average of the inputs
   public static double average(double num1, double num2, double num3){
      //Declare result Variable
      //Assign the sum of the inputs divided by 3 to result
      double result = (num1 + num2 + num3)/3;
      //Round the assigned number to two decimal places
      result = Math.round(result*100)/100.0;
      //return the result
      return result;
   }
}