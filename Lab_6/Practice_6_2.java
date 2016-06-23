// Matthew Whalley
// Summer 2016
// CS1301
// Skinner
// Lab_6_2

public class Practice_6_2{

   public static void main(String[] args){
      //Declare the limit for the rows
      final int ROWS_LIMIT = 10;
      //For int row with value 1
      //Is less than or equal to the rows limit
      //Increment the rows
      for(int row = 1; row <= ROWS_LIMIT; row++)
      {
         //For int star with value of 10
         //Is greater than or equal to row
         //Decrement the star
         for (int star = 10; star >= row; star--)
            //Print out these 10 times then decrement and start a new line
            System.out.print("*");
         //Needed to Output the results of the first for loop   
         System.out.println();   
      }
   }
}