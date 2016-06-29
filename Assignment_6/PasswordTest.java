// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment_6_3
import java.util.Scanner;
public class PasswordTest{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      //Declare Variables
      System.out.print("Enter password: ");
      String pw = input.nextLine();
      int min = 8;
      char pwChar;
      int upperCase = 0;
      int lowerCase = 0;
      int digit = 0;
      
      //If the length is greater than 8 do this
      if(pw.length() >= min){
         //For loop that takes the specific character of input starting at 0
         //Goes till it reaches the end of the entered string
         for(int increment = 0; increment < pw.length(); increment++){
            pwChar = pw.charAt(increment);
            //If specific character is upper case increment upperCase
            if(Character.isUpperCase(pwChar)){
               upperCase++;
            }
            //If specific character is lower case increment lowerCase
            if(Character.isLowerCase(pwChar)){
               lowerCase++;
            }
            //If specific character is a digit increment digit
            if(Character.isDigit(pwChar)){
               digit++;
            }
          }
          //If all variables have a value of at least 1 then password is valid
         if(upperCase >= 1 && lowerCase >= 1 && digit >= 1){
            System.out.println("Password is valid");
         }
         //Else password is invalid
         else
            System.out.println("Invalid");
      }
   }
}  
      
      
   
