// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Lab_6_1

public class Practice_6_1{

   public static void main(String[] args){
   
      int num1 = 0;
      int num2 = 1;
      while(num2 <= 100){
         num2 = num2 + num1;
         num1++;
      }
      System.out.println("The sum of all numbers between 1 and 100 are " + num2);
   }
}