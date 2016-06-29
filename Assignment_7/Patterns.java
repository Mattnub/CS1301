//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_7_3

public class Patterns{

   public static void main(String[] args){
    //Assign line to 1 and run as long as it is less or equal to 6
    for(int line = 1; line <= 6; line++){
      //Assign num to 1 and run as long as it is less or equal to line
      for(int num = 1; num <= line; num++)
         System.out.print(num + " ");
      System.out.println();
    }
      
      System.out.print("\n");
   //Assign line to 6 and run if greater or equal to 1
   //Decrement   
    for (int line = 6; line >= 1; line--){
      for(int num = 1; num <= line; num++)
         System.out.print(num + " ");
      System.out.println();
    }
    System.out.println();
     
    
   
   
   //Pattern D
   //Can't figure out how to space the numbers without making a pyramid
   for(int line = 0; line < 6; line++){
      for(int num = line; num > 0; num--){
         System.out.print(" ");
      }
      for(int num = 1; num <= 6 - line; num++){
         System.out.print(num);
      }
      System.out.println();
   }
   
  }}
