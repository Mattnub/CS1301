//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_11_3
import java.util.Scanner;
public class LocateLargestElement{
   
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      int cont;
      do{
      //Ask for the matrix parameters
      System.out.print("Enter the number of rows and colums of the array: ");
      int row = scan.nextInt();
      int column = scan.nextInt();
      int[] result;
      //Ask for the array
      System.out.println("Enter the array:");
      double[][] matrix = new double[row][column];
      //Store the array
      for(int i = 0; i < row; i++){
         for(int j = 0; j < column; j++){
            matrix[i][j] = scan.nextDouble();
         }
      }
      //Result is the method locateLargest
      result = locateLargest(matrix);
      //Output results
      System.out.println("The location of the largest element is at (" + result[0] + ", " + result[1] + ")");
      System.out.println("Continue? 0 - no: ");
         cont = scan.nextInt();
      }while(cont != 0);   
   }
   
   public static int[] locateLargest(double[][] a){
      double max = 0;
      int[] result = new int[2];
      //Run through the entire matrix and find the largest
      //Store the row and column value and return it
      for(int i = 0; i < a.length; i++){
         for(int j = 0; j < a[i].length; j++){
            if(a[i][j] > max){
               max = a[i][j];
               result[0] = i;
               result[1] = j;
            }
         }
      }
      return result;
   }
}