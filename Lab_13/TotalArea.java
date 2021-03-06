//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_13_1

public class TotalArea{
   public static void main(String[] args){
   
      //Declare circleArray
      CircleWithPrivateDataFields[] circleArray;
      
      //Create circleArray
      circleArray = createCircleArray();
      
      //Print circleArray and total areas of the circle
      printCircleArray(circleArray);
      
      minMax(circleArray);
   }
   
   //Create an array of Circle objects
   public static CircleWithPrivateDataFields[] createCircleArray(){
      CircleWithPrivateDataFields[] circleArray =
         new CircleWithPrivateDataFields[5];
         
      for(int i = 0; i < circleArray.length; i++){
         circleArray[i] = 
            new CircleWithPrivateDataFields(Math.random() * 100);
      }   
      
      //Return circleArray
      return circleArray;
   }
   
   //Print an array of circles and their total area
   public static void printCircleArray(
      CircleWithPrivateDataFields[] circleArray){
      
         System.out.printf("%-30s%s\n", "Radius", "Area");
         for(int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
               circleArray[i].getArea());
         }
         
         System.out.println("------------------------------------------");
         
         //Compute and display the result
         System.out.printf("%-30s%-15f\n", "The total area of circles is",
            sum(circleArray));
      }
      
   //Add circle areas
   public static double sum(CircleWithPrivateDataFields[] circleArray){
      //Initialize sum
      double sum = 0;
      
      //Add areas to sum
      for(int i = 0; i < circleArray.length; i++){
         sum += circleArray[i].getArea();
      }
      
      return sum;
   }
   //Method to find the min and max
   public static void minMax(CircleWithPrivateDataFields[] circleArray){
      double min = 100;
      double max = 0;
      //Loop to parse through the array
      for(int i = 0; i < circleArray.length; i++){
         //If the radius of that index is less than min
         if(circleArray[i].getRadius() < min){
            //Min is assigned to number at that index
            min = circleArray[i].getRadius();
         }
         //If the radius of that index is greater than max
         if(circleArray[i].getRadius() > max){
            //Max is assigned to number at that index
            max = circleArray[i].getRadius();
         }
      }
      //Output the results
      System.out.println("The smallest circle has radius = " + min);
      System.out.println("The largest circle has radius = " + max);
   }   
}