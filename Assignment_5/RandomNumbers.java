// Class: CS 1301
// Term: Summer 2016
// Name: Matthew Whalley
// Instructor: Skinner
// Assignment 5_2


public class RandomNumbers{

   public static void main(String[] args){
      
      //Part A: Generate random integer between 30 and 50
      int random1 = (int)(30 + Math.random() * 21);
      System.out.println("A number between 30 and 50:\t\t" + random1);
      
      //Part B: Generate a random integer between 20 and -20
      int random2 = (int)(20 + Math.random() * -41);
      System.out.println("A number between 20 and -20:\t\t" + random2);
      
      //Part C: Generate a random integer between -20 and -60
      int random3 = (int)(-20 + Math.random() * -41);
      System.out.println("A number between -20 and -60:\t\t" + random3);
      
      //Part D: Generate a random float between 0.0 and 15.9999
      float random4 = (float)(Math.random() * 16);
      System.out.println("A float between 0.0 and 15.9999:\t" + random4);
 }
}