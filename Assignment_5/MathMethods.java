// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 5_3

import java.util.Scanner;

public class MathMethods{
   
   public static void main(String[] args){
      
      //Declare Scanner Class
      //Declare basic Variables
      Scanner input = new Scanner(System.in);
      int negInt, root;
      float angle, round, xInput, yInput;
      
      //Part A: Prompt User to enter a negative integer
      //Print out its absolute value
      System.out.print("Enter a negative integer: ");
         negInt = input.nextInt();
      if (negInt < 0){
         int negIntAbs = Math.abs(negInt);
         System.out.println("The absolute value of " + negInt + " is " + negIntAbs);
      }
      else{
         System.out.println("That is not a valid input");
         System.exit(1);
      }
      
      //Part B: Prompt user to enter a floating-point number representing an angle
      //Print out the angle's cosine, sine, and tangent
      System.out.print("Enter a float representing an angle: ");
         angle = input.nextFloat();
         float radAngle = (float)Math.toRadians(angle);
            float angleSine = (float)Math.sin(radAngle);
            float angleCosine = (float)Math.cos(radAngle);
            float angleTangent = (float)Math.tan(radAngle);
      System.out.println("The sine of " + angle + " is " + Math.round(angleSine * 100) / 100.0);
      System.out.println("The cosine of " + angle + " is " + Math.round(angleCosine * 100) / 100.0);
      System.out.println("The tangent of " + angle + " is " + Math.round(angleTangent * 100) / 100.0); 
      
      //Part C: Prompt the user to enter a float
      //Print out its floor and ceiling values
      System.out.print("Enter a float: ");
         round = input.nextFloat();
      System.out.println("The floor value of " + round + " is " + Math.floor(round));
      System.out.println("The ceiling value of " + round + " is " + Math.ceil(round));
      
      //Part D: Prompt the user for two floats
      //Print out the value of X raised to the power of Y
      System.out.print("Enter a value for X: ");
         xInput = input.nextFloat();
      System.out.print("Enter a value of Y: ");
         yInput = input.nextFloat();
      System.out.println("The value of X raised to the power of Y is " + Math.pow(xInput, yInput));
      
      //Part E: Prompt User for integer
      //Print out square root
      System.out.print("Enter an integer: ");
         root = input.nextInt();
         System.out.println("The square root of " + root + " is " + Math.sqrt(root));   
   }
}