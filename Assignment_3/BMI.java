// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 3_4

import java.util.Scanner;

public class BMI{
   
   public static void main(String[] args){
      
      Scanner s = new Scanner(System.in);
      
      //Prompt the user to enter weight in pounds
      System.out.print("Enter weight in pounds: ");
      double weight = s.nextDouble();
      
      //Prompt user to enter height in feet
      System.out.print("Enter feet: ");
      double feet = s.nextDouble();
      
      //Prompt the user to enter height in inches
      System.out.print("Enter inches: ");
      double height = s.nextDouble();
      
      final double KILOGRAMS_PER_POUND = 0.45359237; //Constant
      final double METERS_PER_INCH = 0.0254; //Constant
      
      //Compute BMI
      double weightKilograms = weight * KILOGRAMS_PER_POUND;
      double heightInches = (feet * 12);
      double heightMeters = (height + heightInches) * METERS_PER_INCH;
      double bmi = weightKilograms / (heightMeters * heightMeters);
      
      //Display Results
      System.out.println("BMI is " + bmi);
      if (bmi < 18.5)
         System.out.println("Underweight");
      else if (bmi < 25)
         System.out.println("Normal");
      else if (bmi < 30)
         System.out.println("Overweight");
      else
         System.out.println("Obese");
   }
}