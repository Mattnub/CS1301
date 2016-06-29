//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_7_5

import java.util.Scanner;

public class OccurrenceOfMaxNumbers{

   public static void main(String[] args){
      
      int max = 0;
      int count = 0;
      Scanner scan = new Scanner(System.in);
      //Ask user input and assign variable   
      System.out.print("Enter numbers: ");
         int num = scan.nextInt();
     //If enter 0 then stop loop
      while(num != 0){
         //if entered num is greater than max(intially 0)
         //Assign max to num
         //Assign count to 1
         if(num > max){
            max = num;
            count = 1;
         }
         //If entered num equals the max increment count
         else if(num == max){
            count++;
         }
         //Read new input as new num
         num = scan.nextInt();
      }
      //Output
      System.out.println("The largest number is " + max);
      System.out.println("The occurence count of the largest number is " + count);   
   }
}