//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_13_2
import java.util.Random;

public class SummerStats{

   private int[][] salaries;
   
   public SummerStats(int people, int years){
      
      salaries = new int[people][years];
      Random rand = new Random();
      
      for(int i = 0; i < people; i++){
         for(int j = 0; j < years; j++){
            salaries[i][j] = rand.nextInt(100000);
         }
      }
   }
   
   public int[][] getSalaries(){
      return salaries;
   }
   
   public int getMostMoney(){
      
      int[] newArray = new int[salaries[0].length];
      int k = 0;
      
      for(int i = 0; i < salaries.length; i++){
         for(int j = 0; j < salaries[i].length; j++){
            newArray[k] += salaries[i][j];
         }
         k++;
      }
      return getMax(newArray);
   }
   
   public int getMax(int[] arr){
      
      int salary = 0;
      int index = -1;
      
      for(int i = 0; i < arr.length; i++){
         if(salary < arr[i]){
            salary = arr[i];
            index = i;
         }
      }
      return index;
   }
   
   public int getHighestSalary(){
   
      int[][] arr = new int[salaries.length][2];
      int max = 0;
      int index = -1;
      int k = 0;
      
      for(int i = 0; i < salaries.length; i++){
         for(int j = 0; j < salaries[i].length; j++){
            if(max < salaries[i][j]){
               max = salaries[i][j];
               index = i;
            }
         }
         arr[k][0] = max;
         arr[k][1] = index;
         k++;
      }
      
      max = 0;
      index = -1;
      for(int i = 0; i < arr.length; i++){
         if(max < arr[i][0]){
            max = arr[i][0];
            index = arr[i][1];
         }
      }
      return index;
   }
   
   public int getTotalSalary(int person){
   
      int totalSalary = 0;
      for(int i = 0; i < salaries[person].length; i++){
         totalSalary += salaries[person][i];
      }
      
      return totalSalary;
   }
   
   public int getAllSalaries(){
      
      int sum = 0;
      for(int i = 0; i < salaries.length; i++){
         for(int j = 0; j < salaries[i].length; j++){
            sum += salaries[i][j];
         }
      }
      return sum;
   }
}
