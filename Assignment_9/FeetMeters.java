//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_9_1

public class FeetMeters{

   public static void main(String[] args){
      //Output the header
      System.out.println("Feet\tMeters\t|\tMeters\tFeet");
      //Set feet to 1 and meter to 20 and increment as needed
      for(int f = 1, m = 20; f <= 10; f++, m += 5){
         //Output the results formatting as needed and calling the methods
         System.out.println(f + "\t" + footToMeters(f) + "\t|\t" + m + "\t" + meterToFoot(m));
      }
   }
   //Method to find the meters
   public static double footToMeters(double foot){
      double result;
      result = foot * 0.305;
      return result;
   }
   //Method to find the feet
   public static double meterToFoot(double meter){
      double result;
      result = meter * 3.279;
      return result;
   }
}