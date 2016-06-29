//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_7_4
import java.util.Scanner;
public class ComputeCDValue{

   public static void main(String[] args){
      //Declare Variables
      Scanner scan = new Scanner(System.in);
      int month = 0;
      //Ask and store user input
      System.out.print("Enter the initial deposit amount: ");
         double deposit = scan.nextDouble();
      System.out.print("Enter the annual percentage yield: ");
         double yield = scan.nextDouble();
      System.out.print("Enter the maturity period: ");
         double period = scan.nextDouble(); 
      //Output header
      System.out.println("Month\tCD Value");
      //Loop while i is less than entered period do this and increment i
      for (int i = 0; i < period; i++){
         //Perform math to find monthly value and assign it to deposit variable
         deposit += deposit * yield / 1200;
         //Icrement the months each time
         month++;
         //Output the month and the value
         System.out.println(month + "\t" + Math.round(deposit * 100)/ 100.0);
      }
   }
}