// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment: 1_1

import java.util.Scanner;

public class HelloWorld {
   
   public static void main (String[] args){
      
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = s.nextLine();
      System.out.println("Hello " + name + "!");
   }
}