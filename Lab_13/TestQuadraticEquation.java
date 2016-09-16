//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_13_3

public class TestQuadraticEquation{

   public static void main(String[] args){
      //Create 3 test objects to make sure the if statements work
      
      //Equation that returns both roots
      QuadraticEquation qf1 = new QuadraticEquation(1, 3, 1);
      //If discriminate is greater than 0
      //Acquire both roots
      if(qf1.getDiscriminate() > 0){
         System.out.println("The first root is: " + qf1.getRoot1());
         System.out.println("The second root is: " + qf1.getRoot2());
      }
      //If discriminate is 0
      //Only get 1 root
      else if(qf1.getDiscriminate() == 0){
         System.out.println("The only root is: " + qf1.getRoot1());
      }
      //If less than 0 then no real roots
      else{
         System.out.println("The equation has no roots");
      }
      //Space for formatting
      System.out.println();
      
      //Equation that will only return 1 root
      QuadraticEquation qf2 = new QuadraticEquation(1, 2, 1);
      if(qf2.getDiscriminate() > 0){
         System.out.println("The first root is: " + qf2.getRoot1());
         System.out.println("The second root is: " + qf2.getRoot2());
      }
      else if(qf2.getDiscriminate() == 0){
         System.out.println("The only root is: " + qf2.getRoot1());
      }
      else{
         System.out.println("The equation has no roots");
      }
      System.out.println();
      
      //Equation that returns no real toots
      QuadraticEquation qf3 = new QuadraticEquation(1, 2, 3);
      if(qf3.getDiscriminate() > 0){
         System.out.println("The first root is: " + qf3.getRoot1());
         System.out.println("The second root is: " + qf3.getRoot2());
      }
      else if(qf3.getDiscriminate() == 0){
         System.out.println("The only root is: " + qf3.getRoot1());
      }
      else{
         System.out.println("The equation has no roots");
      }
   }
}