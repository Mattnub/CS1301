// Matthew Whalley
// Summer 2016
// CS1301
// Skinner
// Lab_6_3

public class Practice_6_3{

   public static void main(String[] args){
   
      //Must output this before the loop
      System.out.print("The even numbers between 50 and 100 are ");
         //Int even == 50
         //While even is less or equal to 100
         //Output the statement block
         //Add 2 to even
         for(int even = 50; even <= 100; even = even + 2){
            System.out.print(even + ", ");
      }
      //Must output this before the loop
      System.out.print("\nThe odd numbers between 50 and 100 are ");
         //Int odd == 51
         //While odd is less than 100
         //Output the statement block
         //Run the increment and loop back
         for(int odd = 51; odd < 100; odd = odd + 2){
            System.out.print(odd + ", ");
         }
   }
}