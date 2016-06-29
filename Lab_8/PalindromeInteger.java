//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_8_3
import java.util.Scanner;
public class PalindromeInteger{

   public static void main(String[] args){
      //Declare Scanner and Continue variable
      Scanner scan = new Scanner(System.in);
      int cont;
      //Create a do loop
      do{
         //Prompt user for input and store it
         System.out.print("Enter an integer to check for a palindrome: ");
            int input = scan.nextInt();
         //Call the isPalindrome method and check if true
         if(isPalindrome(input)){
            System.out.println(input + " is a palindrome.");
         }
         //If false print this
         else{
            System.out.println(input + " is not a palindrome.");
         }       
         //Ask user if they want to continue
         System.out.println("Do you wish to continue?(1 - yes 0 -no): ");
            cont = scan.nextInt();   
      }
      //Continue so long as the user does not input 0 when prompted
      while(cont != 0);
   }
   //Declare method to reverse the input
   public static int reverse(int number){
      //Assign result to 0
      int result = 0;
      //while the number does not equal 0 run this loop
      while(number != 0){
         //Right most digit is the number modulo 10
         int rmd = number % 10;
         //result is the result multiplied by 10 plus the right most digit
         result = (result * 10) + rmd;
         //Divide the number by 10 to get rid of the right most digit
         number = number / 10;
         //Loop this until number divided by 10 equals 0
      }
      //return the result
      return result;
   }
   //Declare a boolean method
   public static boolean isPalindrome(int number){
   //Call the reverse method in the isPalindrome method
   //If the number equals the reverse of the number returns true
      return (number == reverse(number));
   }
}