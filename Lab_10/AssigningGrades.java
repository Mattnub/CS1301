//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Lab_10_1

import java.util.Scanner;

public class AssigningGrades{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      int cont;
      do{
      //Ask user for input and store it  
      System.out.print("Enter the number of students:");
         int student = scan.nextInt();
      //The length of the array is the input [student]
      int[] score = new int[student];
      //Assign best to 0
      int best = 0;
      //Ask user for the number of scores based on their prior input
      System.out.print("Enter " + student + " scores:");
      //Loop through the array and assign input
      //to the index starting at 0
      for(int i = 0; i < score.length; i++){
         score[i] = scan.nextInt();
            //If best is less than the input score at the given index
            //then that is the best score
            if(best < score[i]){
               best = score[i];
            }
      }
      //declare character grade
      char grade;
      //Loop through the array stopping when the length of the array is reached
      for(int i = 0; i < score.length; i++){
         //If the score at the index(starting at 0)
         //is greater than the best grade - 10 
         //grade is assigned to A
         if(score[i] >= best - 10)
            grade = 'A';
         //Follow the above logic for the rest of the if statement
         else if(score[i] >= best - 20)
            grade = 'B';
         else if(score[i] >= best - 30)
            grade = 'C';
         else if(score[i] >= best - 40)
            grade = 'D';
         else
            grade = 'F'; 
         //Output at the end of each loop the index(i starting at 0 incrementing)
         //Then output the score that is at the index of i
         //Output the assigned grade   
         System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);              
      }
         System.out.println("Would you like to continue? 1 - yes 0 - no ");
            cont = scan.nextInt();
      }while(cont != 0);
   }
}