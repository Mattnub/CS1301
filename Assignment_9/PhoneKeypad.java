//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_9_3
import java.util.Scanner;
public class PhoneKeypad{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      //Prompt user for input and store
      System.out.println("Enter a string: ");
      String input = scan.nextLine();
      String newInput = "";
      //Loop this while less than the length of the input
      for(int i = 0; i < input.length(); i++){
         //number is the method getNumber
         //convert to uppercase and find the charAt
         int number = getNumber(input.toUpperCase().charAt(i));
         if (number != 0){
            newInput = newInput + number;
         }
         else{
            newInput = newInput + input.charAt(i);
         }
      }
      System.out.println(newInput);
   }   
     //Method to get a number from a given character 
     public static int getNumber(char uppercaseLetter){
      
         int number;
         
         switch (uppercaseLetter){
            case 'A':
            case 'B':
            case 'C':
               number = 2;
            break;
            
            case 'D':
            case 'E':
            case 'F':
               number = 3;
            break;
            
            case 'G':
            case 'H':
            case 'I':
               number = 4;
            break;
            
            case 'J':
            case 'K':
            case 'L':
               number = 5;
            break;
            
            case 'M':
            case 'N':
            case 'O':
               number = 6;
            break;
 
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
               number = 7;
            break;
 
            case 'T':
            case 'U':
            case 'V':
               number = 8;
            break;
 
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
               number = 9;
            break;
 
            default:
               number = 0;
            break;
         }
         return number;
      }
}