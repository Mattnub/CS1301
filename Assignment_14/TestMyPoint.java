//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_14_2

public class TestMyPoint{

   public static void main(String[] args){
      
      MyPoint point1 = new MyPoint();
      MyPoint point2 = new MyPoint(10,30.5);
      System.out.println("Point1 " + point1);
      System.out.println("Point2 " + point2);
      System.out.println("Distance between Point1 and Point2 is " + point1.distance(point2));
   }
}