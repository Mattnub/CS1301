//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_12_1

public class TestRectangle{

   public static void main(String[] args){
      //Create an object rect1
      Rectangle rect1 = new Rectangle(4, 40);
      //Display the set width and height
      System.out.println("The width of rect1 is " + rect1.width
         + " and the height of rect1 is " + rect1.height);
      //Create the object rect2   
      Rectangle rect2 = new Rectangle(3.5, 35.9);
      //Display the set width and height
      System.out.println("The width of rect2 is " + rect2.width
         + " and the height of rect2 is " + rect2.height);   
      //Display the area of rect1 and rect2
      System.out.println("\nThe area of rect1 is " + rect1.getArea()
         + " and the perimeter of rect1 is " + rect1.getPerimeter());
      System.out.println("The area of rect2 is " + (Math.round(rect2.getArea() * 100) / 100.0)
         + " and the perimeter of rect2 is " + rect2.getPerimeter());   
   }
}