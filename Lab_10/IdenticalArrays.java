//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_10_4

import java.util.Scanner;

public class IdenticalArrays{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      //Ask for the length of the arrays
      System.out.println("Enter the length of both lists: ");
         int length = scan.nextInt();
      //Create arrays and assign the length to the user input   
      int[] list1 = new int[length];
      int[] list2 = new int[length];
      //Fill list1
      System.out.println("Enter list1: ");
      for(int i = 0; i < list1.length; i++){
         list1[i] = scan.nextInt();
      }
      //Fill list2
      System.out.println("Enter list2: ");
      for(int i = 0; i < list2.length; i++){
         list2[i] = scan.nextInt();
      }  
      //Call boolean method
      if(equals(list1, list2)){
         System.out.println("Two lists are identical");
      }
      else{
         System.out.println("Two lists are no identical");
      }
   }
   //Declare boolean method to check the lists
   public static boolean equals(int[] list1, int[] list2){
      selectionSort(list1);
      selectionSort(list2);
      
      for(int i = 0; i < list2.length; i++){
         if(list1[i] != list2[i])
         return false;
      }
      
      return true;
      
   }
   
   public static void selectionSort(int[] list){
      //Simple method given in the book to sort through an array
      for(int i = 0; i < list.length - 1; i++){
         int currentMin = list[i];
         int currentMinIndex = i;
         
         for(int j = i + 1; j < list.length; j++){
            if(currentMin > list[j]){
               currentMin = list[j];
               currentMinIndex = j;
            }
         }
         if(currentMinIndex != i){
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
         }
      }
   }  
    
}