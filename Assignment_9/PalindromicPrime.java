//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_9_4

public class PalindromicPrime {
   public static void main(String[] args) {
      int count = 1;

      for (int i = 2; true; i++) {
         //Check if the number is prime and is a palindrome
         //If true output the number followed by a space
         if (isPrime(i) && isPalindrome(i)) {
            System.out.print(i + " ");
         //Check how many numbers are on line
         //Once 10 enter a new line
         if (count % 10 == 0) {
            System.out.println();
         }
         //If the count is 100 stop the loop
         if (count == 100) {
            break;
         }
         //Increment the count
         count++; 
         }
      }
  }

   public static boolean isPrime(int num) {
    //Check if the number is prime
      for (int i = 2; i <= num / 2; i++) {
         if (num % i == 0) {
            return false;
         }
      }

      return true;
   }

  //Method to reverse the numbers
   public static int reversal(int number) {
      int result = 0;

         while (number != 0) {
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
         }

      return result;
   }

  //Returns true is the reverse is the original number
   public static boolean isPalindrome(int number) {
      return number == reversal(number);
   }
}
