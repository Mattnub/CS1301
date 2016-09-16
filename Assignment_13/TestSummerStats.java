//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_13_2
import java.util.Scanner;
public class TestSummerStats{

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      SummerStats test = new SummerStats(6, 7);
      int[][] salary = test.getSalaries();
      
      for(int i = 0; i < salary.length; i++){
         for(int j = 0; j < salary[i].length; j++){
            System.out.print(salary[i][j] + " ");
         }
         System.out.println();
      }
      
      System.out.println("\nIndex of the highest paid person is " + test.getMostMoney());
      System.out.println("\nIndex of the year with the highest salary earned is " + test.getHighestSalary());
      
      System.out.println("\nEnter the person to find their salary: ");
         int person = scan.nextInt();
      
      System.out.println("Total money made by person " + person + " is $" + test.getTotalSalary(person));        
      System.out.println("\nThe total salary for everyone is $" + test.getAllSalaries());
   
   }
}