//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_11_2
import java.util.Scanner;
public class AddMatricies{

   static Scanner scan = new Scanner(System.in);
   static final int ROW = 3;
   static final int COLUMN = 3;
   
   public static void main(String[] args){
      
      int cont;
      double[][] matrix1 = new double[ROW][COLUMN];
      double[][] matrix2 = new double[ROW][COLUMN];
      double[][] matrix3;
      do{
      //Ask for input
      System.out.println("Enter matrix1: ");
         insertNumbers(matrix1);
      System.out.println("Enter matrix2: ");
         insertNumbers(matrix2);
      System.out.println("Matrix1");
         displayMatrix(matrix1);
      System.out.println("Matrix2");
         displayMatrix(matrix2);
      //Output results
      System.out.println("The sum of the matrices is");
         matrix3 = addMatrix(matrix1, matrix2);
         displayMatrix(matrix3);
      System.out.println("Continue? 0 - no: ");
         cont = scan.nextInt();
      }while(cont != 0);   
   }
   
   public static double[][] addMatrix(double[][] a, double[][] b){
      //Adds the values together and stores them
      double[][] result = new double[ROW][COLUMN];
         for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
               result[i][j] = a[i][j] + b[i][j];
            }
         }
         return result;
   }
   
   public static void insertNumbers(double[][] myArray){
      //Stores the input into the matrix
      for(int i = 0; i < ROW; i++){
         for(int j = 0; j < COLUMN; j++){
            myArray[i][j] = scan.nextDouble();
         }
      }
   }

   public static void displayMatrix(double[][] myArray){
      //Displays matrix adding a new line when end of row is reached
      for(int i = 0; i < ROW; i++){
         for(int j = 0; j < COLUMN; j++){
            System.out.print(myArray[i][j] + " ");
         }
         System.out.println();
      }
   }

}