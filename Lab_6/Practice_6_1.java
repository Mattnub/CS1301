// Matthew Whalley
// Summer 2016
// CS1301
// Skinner
// Lab_6_1

public class Practice_6_1{

   public static void main(String[] args){
      //Declare 2 variables
      int sum = 0, num = 1;
      //While num is less or equal to 100
      //Increment num till it reaches 100
      //Apply that value to sum
      while(num <= 100){
         sum = sum + num;
         num++;
      }
      //Output Results
      System.out.println("The sum of all values between 1 and 100 is " + sum);
   }
}