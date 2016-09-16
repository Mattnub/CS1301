//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_12_2
import java.util.Date;
public class Account{
   //Declare variables
   private int id = 0;
   private double balance = 0;
   private double annualInterestRate = 0;
   private Date dateCreated;
   //Create the default account
   Account(){
      dateCreated = new Date();
   }
   //Create a constructor for Account
   public Account(int id, double balance){
      dateCreated = new Date();
      this.id = id;
      this.balance = balance;
   }
   //Return the ID
   public int getId(){
      return id;
   }
   //Allows the setting of the ID
   public void setId(int id){
      this.id = id;
   }
   //Return the balance
   public double getBalance(){
      return balance;
   }
   //Allows the setting of the balance
   public void setBalance(double balance){
      this.balance = balance;
   }
   //Returns the annual interest rate
   public double getAnnualInterestRate(){
      return annualInterestRate;
   }
   //Returns the date in string form
   public String dateCreated(){
      return dateCreated.toString();
   }
   //Allows the setting of the interest rate
   public void setAnnualInterestRate(double annualInterestRate){
      this.annualInterestRate = annualInterestRate;
   }
   //Method that finds the monthly interest rate
   public double getMonthlyInterestRate(){
      return (annualInterestRate / 100) / 12;
   }
   //Returns the monthly interest
   public double getMonthlyInterest(){
      return balance * getMonthlyInterestRate();
   }
   //Method that subtracts the ammount withdrawn from the balance
   public void withdraw(double withdraw){
      balance -= withdraw;
   }
   //Method that adds the ammount deposited to the balance
   public void deposit(double deposit){
      balance += deposit;
   }
   //String that returns the info required
   //Calls the variables
   public String myObject(){
      return ("Account ID: " + id + "\nAccount Balance: $" + balance
         + "\nInterest Rate: " + annualInterestRate + "%\nDate Opened: " + dateCreated);
   }
}