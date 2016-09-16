//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_13_1

public class TestFan{

   public static void main(String[] args){
      
      Fan fan1 = new Fan();
      Fan fan2 = new Fan(fan1.FAST, 10, true, "yellow");
      Fan fan3 = new Fan(fan1.MEDIUM,5, false, "blue");
      
      System.out.println(fan1.toString());
      System.out.println();
      System.out.println(fan2.toString());
      System.out.println();
      System.out.println(fan3.toString());
   }
}