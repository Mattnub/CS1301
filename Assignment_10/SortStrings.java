//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_10_3
import java.util.Scanner;
public class SortStrings{

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      int cont;
      int size;
      do{
         //Ask for a size
         System.out.println("Enter a size for the array: ");
            size = scan.nextInt();
         //Declare array
         String[] list = new String[size];
         //Ask for inputs and assign them to each index
         System.out.println("Enter " + size + " names: ");
            for(int i = 0; i < list.length; i++){
               list[i] = scan.nextLine();
            }
         //Output the array      
         System.out.print("Strings before sorting: ");
            for(int i = 0; i < list.length; i++){
               System.out.print(list[i] + " ");
            }
         //Call the method   
         selectionSort(list);
         //Output the results of sorting
         System.out.print("\nString after sorting: ");
            for( int i = 0; i < list.length; i++){
               System.out.print(list[i] + " ");
            }      
         System.out.println("Continue? 0 - no: ");
            cont = scan.nextInt();
      }while(cont != 0);
   }
   
   public static void selectionSort(String[] list){
      //Modified method to sort an array of strings
      for(int i = 0; i < list.length - 1; i++){
         String currentMin = list[i];
         int currentMinIndex = i;
         
         for(int j = i + 1; j < list.length; j++){
            if(currentMin.compareTo(list[j]) < 0){
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