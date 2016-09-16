//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_13_1

public class Fan{

   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST = 3;
   private int speed = SLOW;
   private boolean on = false;
   private double radius = 5;
   String color = "blue";
   
   Fan(){
      speed = SLOW;
      on = true;
      radius = 1;
      color = "white";
   }
   Fan(int speed, double radius, boolean on, String color){
      this.speed = speed;
      this.radius = radius;
      this.on = on;
      this.color = color;
   }
   public void setSpeed(int speed){
      this.speed = speed;
   }
   public int getSpeed(){
      return speed;
   }
   
   public void setRadius(double radius){
      this.radius = radius;
   }
   public double getRadius(){
      return radius;
   }
   
   public void setColor(String color){
      this.color = color;
   }
   public String getColor(){
      return color;
   }
   
   public void setStatus(boolean on){
      this.on = on;
   }
   public boolean getStatus(){
      return on;
   }
   
   public String toString(){
      if(getStatus() == true){
      return ("Speed: " + getSpeed() + "\nColor: " + getColor() +
         "\nRadius: " + getRadius());
      }
      else{
         return ("Color: " + getColor() + "\nRadius: " + getRadius() +
            "\nFan is off");
      }
   }
}