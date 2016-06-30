//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_8_2

public class TaxTable{

   public static void main(String[] args){
      //Output header and make them line up   
      System.out.print("Taxable\t\tSingle\t\tMarried Joint\t\tMarried\t\t\tHead of\n" +
         "Income\t\t\t\tor Qualifying\t\tSeparate\t\ta House\n\t\t\t\tWidow(er)");     
      //Create loop starting at 50k incrementing by 50
      for(double income = 50000; income <= 60000; income += 50){
         //Output and round the results
         System.out.println("\n" + Math.round(income) + "\t\t" + Math.round(computeTax(0, income)) + "\t\t" +
            Math.round(computeTax(1, income))+ "\t\t\t" + Math.round(computeTax(2, income)) + "\t\t\t" +
            Math.round(computeTax(3, income)));
      }         
   }
   //Create a method for computing the tax
   public static double computeTax(int status, double taxableIncome){
      double result = 0;
      //Do the math for each status
      //Simplified since we only use one tax bracket in this example
      if(status == 0){
         if(taxableIncome <= 82250){
            result = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
         }
      }
      if(status == 1){
         if(taxableIncome <= 67900){
            result = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
         }
      } 
      if(status == 2){
         if(taxableIncome <= 68525){
            result = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
         }
      }   
      if(status == 3){
         if(taxableIncome <= 117450){
            result = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
         }
      }
      return result;   
      
   }
}