//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_7_1

import java.util.Scanner;

public class PositiveNegative{

   public static void main(String[] args){
      //Decalre variables and Scanner
      Scanner input = new Scanner(System.in);
      int posNumber = 0;
      int negNumber = 0;
      int count = 0;
      double total = 0.0, average;
      //Ask for user input
      System.out.print("Enter an integer, the input ends if it is 0: ");
         //Assign a variable to input
         int number = input.nextInt();
         //Check if it equals 0 first
         if (number == 0){
            System.out.print("No numbers are entered except " + number);
            System.exit(0);
         }
         //While is does not equal 0 do this
         while(number != 0){
            //Increment the total by the number to acquire the sum of all digits
            total += number;
            //Increment count each time to get the number of digits entered
            count++;
            //If greater than zero increment posNumber
            if(number > 0){
               posNumber++;
            }
            //Otherwise increment negative number
            else{
               negNumber++;
            }
            //Assign the next input to the number variable to the loop works
            number = input.nextInt();
          
         }
         //Take the total by the incremented count to get average
         average = total / count;
         //Output all results
         System.out.print("The number of positives is " + posNumber);
         System.out.print("\nThe number of negatives is " + negNumber);
         System.out.print("\nThe total is " + total);
         System.out.print("\nThe average is " + average);
   }
}