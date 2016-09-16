//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_14_2

public class TestTime{
   
   public static void main(String[] args){
      
      Time time = new Time();
      System.out.println(time.toString());
      time = new Time(555550000);
      System.out.println(time.toString());
   }
}