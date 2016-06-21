//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Lab_5_1

import java.util.Scanner;

public class Pentagon{

   public static void main(String[] args){
   
      Scanner s = new Scanner(System.in);
      
      double side, radius, area;
      System.out.print("Enter the length from the center to a vertex: ");
      radius = s.nextDouble();
      
      side = (2 * radius * (Math.sin(Math.PI / 5)));
      area = (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 5)));
      area = Math.round(area * 100) / 100.0;
      
      System.out.print("The area of the pentagon is " + area);
   }
}