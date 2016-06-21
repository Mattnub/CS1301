//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_4_1

import java.util.Scanner;

public class TSBN_Number{

   public static void main(String[] args){
      //Declare Scanner
      Scanner s = new Scanner(System.in);

      //Prompt user for input
      System.out.print("Enter a 9-digit number: ");
      int input = s.nextInt();
      //Pull out each individual int
      int d9 = input % 10;
      int d8 = input % 100 / 10;
      int d7 = input % 1000 / 100;
      int d6 = input % 10000 / 1000;
      int d5 = input % 100000 / 10000;
      int d4 = input % 1000000 / 100000;
      int d3 = input % 10000000 / 1000000;
      int d2 = input % 100000000 / 10000000;
      int d1 = input % 1000000000 / 100000000;
      //Calculate d10 with isolated ints
      int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9))%11;
         //If d10 equals 10 then output this line with X as value
         if (d10 == 10)
            System.out.print("The ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
         //Else output the new value with d10 at end
         else
            System.out.print("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
   }
}