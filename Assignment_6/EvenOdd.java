// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment_6_2

public class EvenOdd{

   public static void main(String[] args){
      //Declare variables
      int even = 50;
      int odd = 51;
      String evenString = "";
      String oddString = "";
      //While the even number is less than 100
      while (even <= 100){
         
         //Add the intial values to a string
         evenString = evenString + even + ", ";
         oddString = oddString + odd + ", ";
         //Add to to even and odd values
         even = even + 2;
         odd = odd + 2;
         }
         //Output results
         System.out.println("Even numbers between 50 and 100 are " + evenString);
         System.out.println("Odd numbers between 50 and 100 are " + oddString);
          
   }
}