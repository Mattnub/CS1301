// Matthew Whalley
// Summer 2016
// CS1301
// Skinner
// Lab_6_4
import java.util.Scanner;
public class Practice_6_4{

   public static void main(String[] args){
      //Declare Scanner Class
      Scanner input = new Scanner(System.in);
      //Ask for User Input
      System.out.print("Enter a String: ");
         //Store User Input
         String userInput = input.nextLine();
      //Output User Input
      System.out.println("Entered String: " + userInput);
      //Declare Variables for Substring Index
      //The character number and the Length of the String
      int subIndex =0;
      int charNum = 1;
      int stringLength;
      //stringLength set to 0
      //While stringLength is less than the Length of the User Input
      //Increment the Substring Index, character number, and the stringLength variable
      for(stringLength = 0; stringLength < userInput.length(); subIndex++, charNum++, stringLength++){
         //Output the character number we are currently on starting at 1
         //Output specific character in the string the User inputs starting at 0
         System.out.println("Character #" + charNum + ":\t" + userInput.charAt(subIndex));
      }     
   }
}