//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_4_2

import java.util.Scanner;

public class DayOfTheWeek{

   public static void main(String[] args){
      //Declare Scanner
      Scanner s = new Scanner(System.in);
      //Declare variables
      int q, m, j, year, h, k;
      //Ask for user input
      System.out.print("Enter year: ");
         year = s.nextInt();
      System.out.print("Enter month: 1-12: ");
         m = s.nextInt();
      System.out.print("Enter the day of the month: 1-31: ");
         q = s.nextInt();
      //If Month equals 1
      //Change variable m to 13
      //Subtract variable year by 1   
      if (m == 1){
         m = 13;
         year = (year - 1);
      }
      //If Month equals 2
      //Change variable m to 14
      //Subtract variable year by 1
      else if (m == 2){
         m = 14;
         year = (year - 1);
      }
      //Calculate variable k and j
      k = (year % 100);
      j = (year / 100);
      //Perform equation with all variables
      h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
     
      //Check each case and output results
      switch (h){
      
      case 0: System.out.print("The day of the week is Saturday"); break;
      case 1: System.out.print("The day of the week is Sunday"); break;
      case 2: System.out.print("The day of the week is Monday"); break;
      case 3: System.out.print("The day of the week is Tuesday"); break;
      case 4: System.out.print("The day of the week is Wednesday"); break;
      case 5: System.out.print("The day of the week is Thursday"); break;
      case 6: System.out.print("The day of the week is Friday"); break;
      }
   }
}
