//Matthew Whalley
//CS1301
//Summer 2016
//Skinner
//Assignment_7_2

public class DivisiblesBy5And6{

   public static void main(String[] args){
         
      int counter = 0;
      //For int i assigned to 100
      //While less or equal to 200
      //Icrement the i
      for(int i = 100; i <= 200; i++){
         //if the modulo 5 is 0
         //output the number
         if(i % 5 == 0){
            System.out.print(i + " ");
            counter++;
         }
         //if modulo 6 is 0
         //ouput the number
         else if(i % 6 == 0){
            System.out.print(i + " ");
            counter++;
         }
         //if counter equals 10 then there are 10 number in the row
         //Create a new line and set counter equal to 0
         if(counter == 10){
            System.out.println();
            counter = 0;
         }
      }
      
      //Don't understand how to make it loop in the same run with different inputs
      //I know the for loop you be (i = someInput; i <= otherInput; i++)
      //but im not sure how to keep the loop going and taking new input
   }
}