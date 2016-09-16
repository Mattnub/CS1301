//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_14_1

import java.util.Scanner;

public class TestLoan{
   
   public static void main(String[] args){
      
      //Create scanner class
      Scanner input = new Scanner(System.in);
      
      //Enter annual interest rate
      System.out.print(
         "Enter annual interest rate, for example, 8.25: ");
      double annualInterestRate = input.nextDouble();
      
      //Enter number of years
      System.out.print("Enter number of years as an integer: ");
      int numberOfYears = input.nextInt();
      
      //Enter loan amount
      System.out.print("Enter loan amount, for example, 120000.95: ");
      double loanAmount = input.nextDouble();
      
      //Create a Loan object
      Loan loan = 
         new Loan(annualInterestRate, numberOfYears, loanAmount);
         
      //Display loan date, monthly payment, and total payment
      System.out.printf("The loan was created on %s\n" +
         "The monthly payment is %.2f\nThe total payment is %.2f\n",
         loan.getLoanDate().toString(), loan.getMonthlyPayment(),
         loan.getTotalPayment());
      
      //Create a new loan with the specified parameters   
      Loan carLoan = new Loan(8.50, 5, 15000);
      //Output the results
      System.out.print("\nThe loan was created on " + carLoan.getLoanDate().toString()
         + "\nThe monthly payment is $" + carLoan.getMonthlyPayment()
         + "\nThe total payment is $" + carLoan.getTotalPayment());            
   }
}