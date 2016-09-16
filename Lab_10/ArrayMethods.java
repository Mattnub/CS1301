//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_10_5

public class ArrayMethods{

   public static void main(String[] args){
   //Declare the array
   int[] bigArray = new int[5];
   //Fill it with random numbers   
   for(int i = 0; i < bigArray.length; i++){
      bigArray[i] = (int)(Math.random() * 1001);
   }
   //Output the array
   System.out.print("Original Array: ");
   for(int i = 0; i < bigArray.length; i++){
      System.out.print(bigArray[i] + " ");
   }
      //Call the methods to output the results
      System.out.println("\nThe max number is " + arrayMax(bigArray));
      System.out.println("The min number is " + arrayMin(bigArray));
      arraySquared(bigArray);
      arrayReversed(bigArray);
      
   }
   public static int arrayMax(int[] arr){
   
   int max = 0;
   //Check through the array and which ever is the greatest is returned
   for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
         max = arr[i];
      }
   }
      return max;
   }
   public static int arrayMin(int[] arr){
   
   int min = 1001;
   //Check through the array and whichever is the lowest is returned
   for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
         min = arr[i];
      }
   }
      return min;
   
   }
   public static void arraySquared(int[] arr){
      //Declare a new array to hold square values
      int[] result = new int[arr.length];
      //Go through array and square each index
      for(int i = 0; i < arr.length; i++){
         result[i] = (int)Math.pow(arr[i], 2);
      }
      //Output the results of the new array
      //Could not figure out how to return the values and they still be in int form
      System.out.print("The array squared is ");
      for(int i = 0; i < result.length; i++){
         System.out.print(result[i] + " ");
      }
      
         
   }
   public static void arrayReversed(int[] arr){
      //Declare new array to hold the reverse values
      int[] result = new int[arr.length];
      //Go through the array starting at the beginning of one and end of the other
      for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
         result[j] = arr[i];
      }
      //Output the results
      System.out.print("\nThe reverse of the array is ");
      for(int i = 0; i < result.length; i++){
         System.out.print(result[i] + " ");
      }
      
   }
}