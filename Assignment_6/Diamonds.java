// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment_6_4

public class Diamonds{

   public static void main(String[] args){
   //for int row set to 1
   //While row is less than 10 add 2 to row
   for (int row = 1; row < 10; row += 2) {
      //For int row set at 0
      //While star is less than 9 and row/2
      //Increment star
      //This is to make sure the program stars in the middle
      for (int star = 0; star < 9 - row / 2; star++)
         System.out.print(" ");
      //For int star = 0
      //While star is less than row
      //Increment star
      for (int star = 0; star < row; star++)
         System.out.print("*");
      //Skip to new line and repeat
      System.out.print("\n");
    }
   //For int row set to 7
   //While row is greater than 0
   //Subtract 2 from row
   for (int row = 7; row > 0; row -= 2) {
      //Int star initialized to 0
      //While star is less than 9 and row/2
      //Increment star
      //This adds spaces as the loop runs
      for (int star = 0; star < 9 - row / 2; star++)
        System.out.print(" ");
      //For star set to 0 while star is less than row
      //Increment star and output a star
      for (int star = 0; star < row; star++)
        System.out.print("*");
      //Skip to new line and repeat
      System.out.print("\n");
    }
    //Skip to new line to start next formation
    System.out.print("\n");
    
    //Set int row to 9
    //While row is greater than 0
    //Subtract 2 from row
    for (int row = 9; row > 0; row -=2){
      //Set int space to 0
      //While space is less than 11 - row/2
      //Increment space
      for (int space = 0; space < 11 - row / 2; space++)
         System.out.print(" ");
      //Set int star to 0
      //While star is less than row'
      //Increment star   
      for (int star = 0; star < row; star++)
         System.out.print("*");
      //Start a new line and loop   
      System.out.print("\n");      
      
    }
    //This will increment the stars again
    //Set row to 3 so we dont repeat a single star
    for (int row = 3; row <= 9; row += 2){
      //Set star to 0 and make sure it is less than 11 - row/2
      //Increment star      
      for (int star = 0; star < 11 - row / 2; star++)
         System.out.print(" ");
      //Set int star to 0 and make sure it is less than row
      //While it is increment star   
      for (int star = 0; star < row; star++)
         System.out.print("*");
      //Start new line and loop   
      System.out.print("\n");    
      }  
  }
} 
         
   

