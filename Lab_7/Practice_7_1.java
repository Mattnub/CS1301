//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_7_1
import java.util.Scanner;
public class Practice_7_1{

   public static void main(String[] args){
      //Declare Scanner and Variables
      Scanner scan = new Scanner(System.in);
      int value;
      //Prompt user for input and store as int
      System.out.print("Enter a value between 20 and 60: ");
         value = scan.nextInt();
      //While the value is less than 20
      //Or the value is greater than 60
      //Inform user and end loop   
      while(value < 20 || value > 60){
         System.out.print("That is not a valid input");
         break;
      }
      //If value is greater or equal to 20
      //And value is less or equal to 60
      if (value >= 20 && value <= 60){
         //Declare sum variable
         int sum = 0;
         //Declare int i and set it to value 2
         //Stop loop when i is greater or equal to the user input
         //Increment by 2 each loop
         for (int i = 2; i <= value; i += 2){
            //Add the value of i to sum variable
            sum += i;
         }
            //Output User input and the Sum
            System.out.println("Entered value: " + value);
            System.out.println("Sum of even numbers between 2 and " + value + " is: " + sum);
      }     
         
   }
}