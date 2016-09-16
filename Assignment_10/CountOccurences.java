//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_10_1
import java.util.Scanner;
public class CountOccurences{

   public static void main(String[] args){
      //Set the size to include 100
      final int SIZE = 101;
      int cont;
      Scanner scan = new Scanner(System.in);
      //Declare array
      int[] list = new int[SIZE];
      do{
      //Assign the method to list
      list = readIntegers(SIZE);
      //Call the display method using list
      displayCounts(list);
      System.out.println("Continue? 0 - no ");
         cont = scan.nextInt();
      }while(cont != 0);
   }
   
   public static int[] readIntegers(int SIZE){
   
      Scanner scan = new Scanner(System.in);
      //Declare new array 
      int[] myArray = new int[SIZE];
      //Prompt user for input
      System.out.print("Enter a number between 1 and 100: ");
      int num = scan.nextInt();
      //Take input until 0 is entered
      while(num != 0){
         myArray[num]++;
         num = scan.nextInt();
      }
      //Return the array
      return myArray;
   }
   
   public static void displayCounts(int[] myArray){
      //Parse through the array and count the occurences
      //Display the counts
      for(int i = 0; i < myArray.length; i++){
         if(myArray[i] != 0 && myArray[i] != 1){
            System.out.println("Number: " + i + " entered " + myArray[i] + " times.");
         }
         if(myArray[i] == 1){
            System.out.println("Number: " + i + " entered " + myArray[i] + " time.");
         }
      }
   }
}