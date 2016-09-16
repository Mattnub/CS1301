//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Lab_12_4

public class TestCircleWithPrivateDataFields{
   
   public static void main(String[] args){
      
      //Create a circle with radius 5.0
      CircleWithPrivateDataFields myCircle = 
         new CircleWithPrivateDataFields(5.0);
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
      
      //Increase myCircle's radius by 10%
      myCircle.setRadius(myCircle.getRadius() * 1.1);
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
         
      System.out.println("The number of objects created is "
         + CircleWithPrivateDataFields.getNumberOfObjects());
         
      //Create a circle with radius 40
      CircleWithPrivateDataFields yourCircle =
         new CircleWithPrivateDataFields(40);
      System.out.println("The area of the circle of radius "
         + yourCircle.getRadius() + " is " + yourCircle.getArea());
         
      //Increase yourCircle's radius by 50%
      yourCircle.setRadius(yourCircle.getRadius() * 1.5);
      System.out.println("The area of the circle of radius "
         + yourCircle.getRadius() + " is " + yourCircle.getArea());
         
      System.out.println("The number of objects created is "
         + CircleWithPrivateDataFields.getNumberOfObjects());                                 
   }
}