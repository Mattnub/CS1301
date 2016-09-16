//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_10_2

import java.util.Scanner;

public class AverageArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cont;
    do{
    //Create an array with length of 10
    double[] list = new double[10];
    //Ask user for 10 inputs
    System.out.print("Enter 10 double values: ");
    //Assign i to 0 and increment after each loop
    int i = 0;
    while (i < list.length) {
      //Assign the input to the index of i in the array
      list[i] = input.nextDouble();
      //Increment
      i++;
    }
    //Output calling on the method average
    System.out.println(average(list));
    
    System.out.print("Continue? 0 - no ");
      cont = input.nextInt();
    }while(cont != 0);
  }
  
  public static int average(int[] array) {
    int sum = 0;
    //Loop through the array and add the input at the given index to sum
    //Assign sum initially to 0
    //To find average take the sum and divide by the length of the array
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum / array.length;
  }

  public static double average(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum / array.length;
  }
}