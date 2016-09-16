//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_10_3

import java.util.Scanner;

public class EliminateDuplicates{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      int cont;
      int[] myArray = new int[10];
      do{
      System.out.println("Enter " + myArray.length + " numbers: ");
      //Take input and store at each index
      for(int i = 0; i < myArray.length; i++){
         myArray[i] = scan.nextInt();
      }
      //Output results before the duplicate check
      System.out.print("My array before duplicate check: ");
         printArray(myArray);
      //Assing myArray to the eliminateDuplicates method
      myArray = eliminateDuplicates(myArray);
      //Add space for formatting
      System.out.println();
      //Output the results after the duplicate check
      System.out.print("My array after the duplicate check: ");
         printArray(myArray);
         
      System.out.print("\nWould you like to continue? 1 - yes 0 - no ");
         cont = scan.nextInt();
      }while(cont != 0);      
      
      
   }
   
   public static int[] eliminateDuplicates(int[] list){
      //Starting at index 0 and index 1 compare the 2 then increment
      //If they are the same assign the index at j to 0
      for(int i = 0; i < (list.length - 1); i++){
         for(int j = i + 1; j < list.length; j++){
            if(list[i] == list[j]){
               list[j] = 0;
            }
         }
      }
      return list;        
   }
   
   public static void printArray(int[] newArray){
      //Print out each input to user
      //0 is an empty index so we skip it      
      for(int i = 0; i < newArray.length; i++){
         if(newArray[i] != 0){
            System.out.print(newArray[i] + " ");
         }
      }
   }
}   