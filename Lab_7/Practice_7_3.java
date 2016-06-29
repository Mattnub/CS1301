//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_7_3

public class Practice_7_3{

   public static void main(String[] args){
      //Set row to 1 and have it repeat until there are 15 instances in a row
      for (int row = 1; row < 16; row += 2) {
         //Add spaces when needed
         for (int star = 0; star < 9 - row / 2; star++)
            System.out.print(" ");
         //Add the number of stars needed for each row
         for (int star = 0; star < row; star++)
            System.out.print("*");
      
      //Skip to new line and repeat
      System.out.print("\n");
    }
   }
}