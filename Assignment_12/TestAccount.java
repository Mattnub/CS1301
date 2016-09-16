//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_12_2
import java.util.Date;
public class TestAccount{
   
   public static void main(String[] args){
      //Create a new account object
      Account acc1 = new Account(1122, 20000);
      //Set annual interest rate
      acc1.setAnnualInterestRate(4.5);
      //Output the ID, balance, and annual interest rate
      System.out.println("The account number is " + acc1.getId() + " the balance is $"
         + acc1.getBalance() + " and the interest rate is " + acc1.getAnnualInterestRate() + "%");
      //Withdraw a number and print new balance
      acc1.withdraw(2500);
      System.out.println("The balance after withdraw is $" + acc1.getBalance());
      //Deposit a number and print new balance
      acc1.deposit(3000);
      System.out.println("The balance after deposit is $" + acc1.getBalance());
      //Output the monthly interest
      System.out.println("The monthly interest is $" + acc1.getMonthlyInterest());
      //Output the date created
      System.out.println("The date the account was created is " + acc1.dateCreated());
      //Output the info from myObject()
      System.out.println("\n\n" + acc1.myObject());
      //Create two new accounts and set the interest rate
      Account myAccount = new Account(1234, 50000);
      myAccount.setAnnualInterestRate(6.0);
      Account yourAccount = new Account(9578, 54938);
      yourAccount.setAnnualInterestRate(5.5);
      //Output the info from myObject()
      System.out.println("\n\n" + myAccount.myObject());
      System.out.println("\n\n" + yourAccount.myObject());
      //Call the withdraw method on both new objects
      //Output the results
      myAccount.withdraw(6000);
      yourAccount.withdraw(6938);
      System.out.println("\nThe balance of myAccount is $" + myAccount.getBalance());
      System.out.println("The balance of yourAccount is $" + yourAccount.getBalance());
      //Call the deposit method and output the results
      myAccount.deposit(2500);
      yourAccount.deposit(2000);
      System.out.println("\nThe new balance of myAccount is $" + myAccount.getBalance());
      System.out.println("The new balance of yourAccount is $" + yourAccount.getBalance());
      //Display the monthly interest of both accounts
      System.out.println("The monthly interest of myAccount is $" + myAccount.getMonthlyInterest());
      System.out.println("The monthly interest of yourAccount is $" + (Math.round(yourAccount.getMonthlyInterest() * 100) / 100.0));
   }
}