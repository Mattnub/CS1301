//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Lab_5_2

import java.util.Scanner;

public class Hexagon{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      double side, area;
      
      System.out.print("Enter the side: ");
      side = s.nextDouble();
      
      area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
      area = Math.round(area * 100) / 100.0;
      
      System.out.print("The area of the hexagon is: " + area);
   }
}