//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_8_3.1

import java.util.Scanner;
public class TestMyTriangle{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      int cont;
      do{
         //Store user input
         System.out.print("Enter 3 sides of a triangle to calculate the area: ");
            double side1 = scan.nextDouble();
            double side2 = scan.nextDouble();
            double side3 = scan.nextDouble();
         //Check if the input is valid
         if(MyTriangle.isValid(side1, side2, side3)){
            //Output results if true
            System.out.print("The area of the triangle is " + Math.round(MyTriangle.area(side1, side2, side3) * 100) / 100.0);
         }
         else{
            System.out.print("That is not a valid input.");
         }
      //Prompt user if they want to continue   
      System.out.println("\nWould you like to continute(0 - yes, 1 - no): ");
         cont = scan.nextInt();
      }while(cont != 1);
   }
}   