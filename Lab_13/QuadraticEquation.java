//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_13_3

public class QuadraticEquation{
   //Declare private variables
   private double a;
   private double b;
   private double c;
   //Allow the setting of a, b, c
   QuadraticEquation(double a, double b, double c){
      this.a = a;
      this.b = b;
      this.c = c;
   }
   //Get a
   public double getA(){
      return a;
   }
   //Get b
   public double getB(){
      return b;
   }
   //Get c
   public double getC(){
      return c;
   }
   //Get discriminate
   public double getDiscriminate(){
      return Math.pow(getB(), 2) - (4 * getA() * getC()); 
   }
   //Acquire root1 using the discriminate
   public double getRoot1(){
      return ((-1 * getB()) + Math.sqrt(getDiscriminate())) / (2 * getA()); 
   }
   //Acquire root2 using the discriminate
   public double getRoot2(){
      return ((-1 * getB()) - Math.sqrt(getDiscriminate())) / (2 * getA());
   }
}