//Matthew Whalley
//Summer 2016
//CS_1301
//Skinner
//Assignment_12_1

public class Rectangle{
   //Declare width and height variables
   double width;
   double height;
   //Assign a default value to Rectangle class
   Rectangle(){
      width = 1;
      height = 1;
   }
   //Create a constructor that allows you to set a width and height
   //with each object created
   Rectangle(double newWidth, double newHeight){
      width = newWidth;
      height = newHeight;
   }
   //Create a method that returns the area
   double getArea(){
      return width * height;
   }
   //Create a method that returns the perimeter   
   double getPerimeter(){
      return 2 * (width + height);
   }
}