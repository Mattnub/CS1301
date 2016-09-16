//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_14_1

public class TestMyInteger{
   
   public static void main(String[] args){
      
      MyInteger number = new MyInteger();
      System.out.println(number.value + " " + number.isEven()
         + " " + number.isOdd() + " " + number.isPrime()
         + " " + number.isEqual(10));
         
      number = new MyInteger(13);
      System.out.println(number.value + " " + number.isEven()
         + " " + number.isOdd() + " " + number.isPrime()
         + " " + number.isEqual(13));
         
      MyInteger number2 = new MyInteger(15);
      System.out.println(number2.value + " "
         + number2.isEven() + " "
         + number2.isOdd() + " "
         + number2.isPrime() + " "
         + number2.isEqual(number));
         
      char[] myCharArray = {'1', '2', '3', '4', '5'};
      System.out.println(MyInteger.parseInt(myCharArray));
      
      String myString = "54321";
      System.out.println(MyInteger.parseInt(myString));         
   }
}