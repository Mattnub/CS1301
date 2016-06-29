//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_8_4

public class ComputeCommissions{

   public static void main(String[] args){
      //Output the header
      System.out.print("Sales Amount\tCommission\n");
      //Create a for loop
      //We are starting the chart at 10k and incrementing by 5k
      //Once the amount == 100k terminate the loop
      for(int amount = 10000; amount <= 100000; amount += 5000){
         //Output the value of amount and the commission
         //Calling the computeCommission method and assigning parameters to amount
         System.out.println(amount + "\t" + computeCommission(amount));
      }   
   }
   public static double computeCommission(double salesAmount){
      //declare the variable we will be returning
      double commission;
      //If the salesAmount is greater than 100k
      if (salesAmount > 10000){
         //Take the commission of 5k at 8% and 5k at 10%
         //Subtract 10k from the entered amount
         //Multiply that number by 12% and add all amounts to get total commission
         commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;
      }
      //If the salesAmount is greater than 5k
      else if(salesAmount > 5000){
         //Take the commission of 5k at 8%
         //Subtract that 5k from the total amount received
         //Multiply new amount by 10%
         //Add the commission at 8% and 10% to get total commission
         commission = (5000 * 0.08) + (salesAmount - 5000) * 0.1;
      }
      //else the commission is only 8%
      else{
         //Multiply the given amount by 8%
         commission = salesAmount * 0.08;
      }
      //Return the result
      return commission;
   }
}