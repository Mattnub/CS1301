//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_8_2
import java.util.Scanner;
public class ComputeAreas{

   public static void main(String[] args){
      //Declare Variables
      Scanner scan = new Scanner(System.in);
      double sqrSide, sqrArea, rectWidth, rectLength, rectArea, cirRadius, cirArea, triBase, triHeight, triArea;
      int cont = 0;
      do{
      //Prompt User for input
      System.out.print("Enter side length of a square: ");
         sqrSide = scan.nextDouble();
      System.out.print("Enter the width of a rectangle: ");
         rectWidth = scan.nextDouble();
      System.out.print("Enter the length of a rectangle: ");   
         rectLength = scan.nextDouble();   
      System.out.print("Enter the radius of a circle: ");
         cirRadius = scan.nextDouble();
      System.out.print("Enter the base of a triangle: ");
         triBase = scan.nextDouble();
      System.out.print("Enter the height of a triangle: ");
         triHeight = scan.nextDouble();
      //Call methods   
      sqrArea = squareArea(sqrSide);
      rectArea = rectangleArea(rectWidth, rectLength);
      cirArea = circleArea(cirRadius);
      triArea = triangleArea(triBase, triHeight);
      //Output the results to the user
      System.out.println("Square Side = " + sqrSide);
      System.out.println("Square Area = " + sqrArea);
      System.out.println("Rectangle Width = " + rectWidth);
      System.out.println("Rectangle Length = " + rectLength);
      System.out.println("Rectangle Area = " + rectArea);
      System.out.println("Circle Radius = " + cirRadius);
      System.out.println("Circle Area = " + cirArea);
      System.out.println("Triangle Base = " + triBase);
      System.out.println("Triangle Height = " + triHeight);
      System.out.println("Triangle Area = " + triArea);
      //Ask if User wants to continue
      System.out.println("Do you want to continue? (0 - yes/ 1- no): ");
         cont = scan.nextInt();
      }
      //While cont does NOT equal 1 rerun the do loop
      while(cont != 1); 
      
  }        
      //Declare method for the area of a square   
      public static double squareArea(double side){
         //Declare result variable
         double result = 0;
         //Perform the math for area
         result = Math.pow(side, 2);
         //Round to two decimal places
         result = Math.round(result * 100) / 100.0;
         //Return the result
         return result;
      }
      //Declare method for the area of a rectangle
      public static double rectangleArea(double width, double length){
         //Declare result variable
         double result = 0;
         //Perform math for area of rectangle
         result = (width * length);
         //Round that answer
         result = Math.round(result * 100) / 100.0;
         //Return the result
         return result;
      }
      //Declare method for area of a circle
      public static double circleArea(double radius){
         //Declare result variable
         double result = 0;
         //Perform math for area of a circle
         result = (Math.PI * (Math.pow(radius, 2)));
         //Round that answer
         result = Math.round(result * 100) / 100.0;
         //Return the answer
         return result;
      }
      //Declare method for area of a triangle
      public static double triangleArea(double base, double height){
         //Declare result variable
         double result = 0;
         //Perform math for area of a triangle
         result = (base * height) / 2;
         //Round the answer
         result = Math.round(result * 100) / 100.0;
         //Return the answer
         return result;
      }
   }
