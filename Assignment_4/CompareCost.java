//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_4_4

import java.util.Scanner;

public class CompareCost{

   public static void main(String[] args){
      
      Scanner s = new Scanner(System.in);
      //Ask user for package 1 values
      System.out.print("Enter a weight and price for package 1: ");
      double p1w = s.nextDouble();
      double p1p = s.nextDouble();
      //Ask user for package 2 values
      System.out.print("Enter a weight and price for package 2: ");
      double p2w = s.nextDouble();
      double p2p = s.nextDouble();
      
      double p1final;
      double p2final;
      //Find the price per pound
      p1final = (p1p / p1w);
      p2final = (p2p / p2w);
      //Check inputs and the lower is the better price
      if (p1final < p2final){
         System.out.print("Package 1 has the better price.");
      }
      else if (p1final == p2final){
         System.out.print("Package 1 and Package 2 are the same price.");
      }
      else{
         System.out.print("Package 2 has the better price.");
      }
   }
}
