//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Assignment_8_4

public class CrapsGame{

   public static void main(String[] args){
      //Call the rollDie() method and assign it to int roll
      int roll = rollDie();
      //If the initial roll is 7 or 11 you win
      if (roll == 7 || roll == 11){
         System.out.println("You win!");
         System.exit(0);
      }
      //If the initial roll is 2, 3, 12 you lose
      else if (roll == 2 || roll == 3 || roll == 12){
         System.out.println("You lose!");
         System.exit(0);
      }
      //If the above are not met assign int points to the sum of the roll
      int points = roll;
      //Output the points
      System.out.println("Your point is " + points);
      //Roll die until the roll is 7 or the given points
      do{
         roll = rollDie();
      }while(roll != 7 && roll != points);
      //If roll is 7 then you lose
      if (roll == 7){
         System.out.println("You lose!");
      }
      //Otherwise you win
      else{
         System.out.println("You win!");
      }
   }
//Declare method
public static int rollDie(){
   //Roll 1 and roll 2 are random numbers cast as integers
   //between 1 and 6
   int roll1 = 1 + (int)(Math.random() * 6);
   int roll2 = 1 + (int)(Math.random() * 6);
   //Output the roll and the sum of the roll
   //Couldnt figure out how to output this in the main method
   System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2));
   //Return the sum of the rolls
   return roll1 + roll2;
}
}