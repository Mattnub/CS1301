//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_14_2

public class MyPoint{
   
   private double x, y;
   //Default that returns 0,0
   public MyPoint(){
      this(0,0);
   }
   //Allows setting of X and Y
   public MyPoint(double x, double y){
      this.x = x;
      this.y = y;
   }
   //Returns X
   public double getX(){
      return x;
   }
   //Returns Y
   public double getY(){
      return y;
   }
   //Gets the Distance
   public double distance(double x, double y){
      return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y-this.y,2));
   }
   
   public double distance(MyPoint point){
      return distance(point.getX(), point.getY());
   }
   //ToString so everything looks nice
   public String toString(){
      return "(x,y) = (" + x + "," + y + ")";
   }
}
