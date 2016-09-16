//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_13_2

public class TestStock{

   public static void main(String[] args){
      //Create stock1
      Stock stock1 = new Stock("ORCL", "Oracle Corporation");
      //Set the previous closing price and the current price
      stock1.setPreviousClosingPrice(34.5);
      stock1.setCurrentPrice(34.35);
      //Output the symbol, name, and change percent
      System.out.println(stock1.getSymbol() + " " + stock1.getName() + 
         " stock changed by : %" + stock1.getChangePercent()*100);
      //Repeat the above steps for 2 more stocks
      Stock stock2 = new Stock("GOOG", "Google");
      stock2.setPreviousClosingPrice(735.4);
      stock2.setCurrentPrice(736.2);
      
      System.out.println(stock2.getSymbol() + " " + stock2.getName() +
         " stock changed by: %" + (stock2.getChangePercent()*100));
         
      Stock stock3 = new Stock("GM", "General Motors");
      stock3.setPreviousClosingPrice(215.2);
      stock3.setCurrentPrice(210.3);
      
      System.out.println(stock3.getSymbol() + " " + stock3.getName() +
         " stock changed by: %" + stock3.getChangePercent()*100);      
   }
}