//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_9_2
import java.util.Scanner;
public class CheckPassword{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      //Prompt and store input
      System.out.println("Enter a password: ");
         String pass = scan.nextLine();
      //If returns true then password is valid   
      if(isValidPassword(pass))
         System.out.println("Valid Password");  
      else
         System.out.println("Invalid Password");
   }
   public static boolean isValidPassword(String pw){
      //If the charAt is not a letter or a digit then return false
      for (int i = 0; i < pw.length(); i++) {
         if (!Character.isLetter(pw.charAt(i)) && !Character.isDigit(pw.charAt(i)))
         return false;
    }
      //If password is less than 8 characters long return false
      if (pw.length() < 8)
         return false;
      
      int count = 0;
      //Count the digits
      for (int i = 0; i < pw.length(); i++) {
         if (Character.isDigit(pw.charAt(i)))
            count++;
    }
      //If the number of digits is 2 or more return true
      if (count >= 2)
         return true;
      else
         return false;   
   }
}