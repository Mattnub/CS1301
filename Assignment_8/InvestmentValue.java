//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_8_1
import java.util.Scanner;
public class InvestmentValue{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      //Get user input
      System.out.print("Enter an investment amount: ");
         double investAmount = scan.nextDouble();
      System.out.print("Enter an interest rate: ");
         double interestRate = scan.nextDouble();
            //Convert percent to decimal
            interestRate = interestRate / 100;
      //Output the header
      System.out.print("Years\tFuture Value\n");
      //Years = 1 do this code till years = 30
      //incrementing years each iteration
      for(int years = 1; years <= 30; years++){
         System.out.println(years + "\t" + futureInvestmentValue(investAmount, interestRate, years));   
      }
   }
   //Declare method for future investment value
   public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
      //Declare result variable
      double result;
      //Result is the investamount multiplied
      //by the sum of 1 and the monthlyInterestRate
      //raised to the power of years multiplied by 12
      //monthlyInterestRate is divided by 12 to get each month
      result = investmentAmount * Math.pow((1 + (monthlyInterestRate / 12)), (years * 12));
      //Round the result
      result = Math.round(result * 100) / 100.0;
      //Output the result
      return result;
   
   }
}