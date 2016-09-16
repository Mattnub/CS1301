//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_11_1
import java.util.Scanner;
public class SumArrayColumns{
   //Set constants
   static final int ROW = 3;
   static final int COLUMN = 4;
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args){
      
      int cont;
      double[][] myMatrix = new double[ROW][COLUMN];
      do{
      //Ask for input
      System.out.println("Enter a 3-by-4 matrix row by row: ");
      //Call methods
      insertNumbers(myMatrix);
      displayMatrix(myMatrix);
      //Output results
      for(int i = 0; i < myMatrix[0].length; i++){
         System.out.println("Sum of the elements at column " + i + " is " + sumColumn(myMatrix, i));
      }
      System.out.print("Continue? 0 - no: ");
         cont = scan.nextInt();
      }while(cont != 0);
   }
   
   public static double sumColumn(double[][] m, int columnIndex){
      //Adds the column values
      double sum = 0;
      for(int i = 0; i < m.length; i++){
        sum += m[i][columnIndex];
      }    
      return sum;
   }
   
   public static void insertNumbers(double[][] myArray){
      //Stores the input for the entire matrix
      for(int i = 0; i < ROW; i++){
         for(int j = 0; j < COLUMN; j++){
            myArray[i][j] = scan.nextDouble();
         }
      }
   }
   
   public static void displayMatrix(double[][] myArray){
      //Displays the matrix adding a new line when end of row is reached
      for(int i = 0; i < ROW; i++){
         for(int j = 0; j < COLUMN; j++){
            System.out.print(myArray[i][j] + " ");
         }
         System.out.println();
      }
   }
}