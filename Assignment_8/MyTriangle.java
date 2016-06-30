//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_8_3
import java.util.Scanner;
public class MyTriangle{
   //Declare boolean method to check if the input is valid
   public static boolean isValid(double side1, double side2, double side3){
      return !(side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2);
 }
   //Declare double method to calculate the area assuming input is valid
   public static double area(double side1, double side2, double side3){
      double result = (side1 + side2 + side3) / 2;
      double area = Math.sqrt(result * (result - side1) * (result - side2) * (result - side3));
      return area;
   }
}
