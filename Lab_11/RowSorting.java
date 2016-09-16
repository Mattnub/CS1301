//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_11_4

import java.util.Scanner;

public class RowSorting {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    
      final int SIZE = 3;
      int cont;
      do{
      //Ask for the input
      System.out.print("Enter a 3 by 3 matrix row by row: ");
      double[][] m = new double[SIZE][SIZE];
      //Store the input
      for (int i = 0; i < m.length; i++)
        for (int j = 0; j < m[0].length; j++)
          m[i][j] = scan.nextDouble();

      double[][] result = sortRows(m);
      //Output the results
      System.out.println("The row-sorted array is");
      for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++)
          System.out.print(result[i][j] + " ");
        System.out.println();
      }
      System.out.println("Continue? 0 - no: ");
         cont = scan.nextInt();
      }while(cont != 0);
   } 
  
   public static double[][] sortRows(double[][] m) {
  	   double[][] result = new double[m.length][m[0].length];
  	
  	   // Copy from m to result
  	   for (int i = 0; i < m.length; i++)
         for (int j = 0; j < m[0].length; j++)
           result[i][j] = m[i][j];

  	   // Check the sum of each column
  	   for (int i = 0; i < result.length; i++) 
  	   	java.util.Arrays.sort(result[i]);

  	   return result;
   } 
}
