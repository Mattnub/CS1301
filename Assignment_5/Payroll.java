// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 5_5

import java.util.Scanner;

public class Payroll{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //Prompt User for Information
      System.out.print("Enter employee's name: ");
         String name = input.nextLine();
      System.out.print("Enter number of hours worked in a week: ");
         double hours = input.nextDouble();
      System.out.print("Enter hourly pay rate: ");
         double payRate = input.nextDouble();
      System.out.print("Enter federal tax withholding rate: ");
         double fedTax = input.nextDouble();
      System.out.print("Enter state tax withholding rate: ");
         double stateTax = input.nextDouble();
         
      //Calculate Gross Pay, Federal Tax Withholding
      //State Tax Withholding, Total Deduction, and Net Pay
      double grossPay, fedTaxTotal, stateTaxTotal, totalDeduction, netPay;
         grossPay = (hours * payRate);
         fedTaxTotal = (grossPay * fedTax);
         stateTaxTotal = (grossPay * stateTax);
         totalDeduction = (stateTaxTotal + fedTaxTotal);
         netPay = (grossPay - totalDeduction);      
      
      //Output the results to the User
      System.out.println("\nEmployee name: " + name);
      System.out.println("Hours Worked: " + hours);
      System.out.println("Pay Rate: $" + payRate);
      System.out.println("Gross Pay: $" + grossPay);
      System.out.println("Deductions:\n\tFederal Withholding (" 
                           + (fedTax * 100) + "%): $" + (Math.round(fedTaxTotal * 100) / 100.0) 
                           + "\n\tState Withholding (" + (stateTax * 100) 
                           + "%): $" + (Math.round(stateTaxTotal * 100) / 100.0) 
                           + "\n\tTotal Deductions: $" + (Math.round(totalDeduction * 100) / 100.0));
      System.out.println("Net Pay: $" + (Math.round(netPay * 100) / 100.0));                      
   }
}