//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_10_2

import java.util.Scanner;

public class Statistics{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      int cont;
      do{
      //Ask for input and declare the array
      System.out.print("Enter ten numbers: ");
      double[] list = new double[10];
      //Parse through the array
      //Assign values at each index
      for(int i = 0; i < list.length; i++){
         list[i] = scan.nextDouble();
      }
      //Output the mean
      System.out.println("The mean is " + mean(list));
      //Output the standard deviation
      System.out.println("The standard deviation is " + deviation(list));
      System.out.println("Continue? 0 - no: ");
         cont = scan.nextInt();
      }while(cont != 0);   
   }
   
   public static double deviation(double[] x){
      //Assign the method mean to the variable mean
      double mean = mean(x);
      double sum = 0;
      //Parse through the array and do math to each index
      for(int i = 0; i < x.length; i++){
         sum += Math.pow((x[i] - mean), 2);
      }
      //Return the rest of the equation
      return Math.sqrt(sum / (x.length - 1));
      
   }
   
   public static double mean(double[] x){
      //Calculate the mean
      double sum = 0;
      for(int i = 0; i < x.length; i++){
         sum += x[i];
      }
      
      return sum / x.length;
   }
}