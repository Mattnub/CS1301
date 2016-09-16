//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_14_1

public class MyInteger{

   int value;
   //Sets defaults value
   public MyInteger(){
      value = 0;
   }
   //Creates new value
   public MyInteger(int value){
      this.value = value;
   }
   //Returns value
   public int getValue(){
      return value;
   }
   //Checks if even and returns boolean
   public boolean isEven(){
      return ((value % 2) == 0);
   }
   //Checks if odd
   public boolean isOdd(){
      return ((value % 2) != 0);
   }
   //Checks if prime and not 0
   public boolean isPrime(){
      
      if (value < 2){
         return false;
      }
      for(int i = 2; i <= value / 2; i++){
         if ((value % i) == 0){
            return false;
         }   
      }
      return true;
   }
   //Checks if value passed in is even
   public static boolean isEven(int value){
      return ((value % 2) == 0);
   }
   //Checks if passed in value is odd
   public static boolean isOdd(int value){
      return ((value % 2) != 0);
   }
   //Checks if passed in value is prime
   public static boolean isPrime(int value){
      for(int i  = 2; i <= value / 2; i++){
         if((value % i) == 0){
            return false;
         }
      }
      return true;
   }
   //Calls the methods above
   //Easier to look at
   public static boolean isEven(MyInteger value){
      return value.isEven();
   }
   public static boolean isOdd(MyInteger value){
      return value.isOdd();
   }
   public static boolean isPrime(MyInteger value){
      return value.isPrime();
   }
   //Checks if equal
   public boolean isEqual(int value){
      return (this.value == value);
   }
   
   public boolean isEqual(MyInteger value){
      return value.isEqual(this.value);
   }
   //Parse through an array
   public static int parseInt(char[] myCharArray){
      return Integer.parseInt(new String(myCharArray));
   }
   
   public static int parseInt(String myString){
      return Integer.parseInt(myString);
   }
}