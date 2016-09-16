//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_13_2

public class Stock{
   
   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;
   //Allows user to set symbol and name
   Stock(String symbol, String name){
      this.symbol = symbol;
      this.name = name;
   }
   //Grabs the symbol
   String getSymbol(){
      return symbol;
   }
   //Grabs the name
   String getName(){
      return name;
   }
   //Calculates the change percentage
   double getChangePercent(){
      double change = currentPrice - previousClosingPrice;
      return (change) / (previousClosingPrice);
   }
   //sets the previous closing price
   void setPreviousClosingPrice(double previousClosingPrice){
      this.previousClosingPrice = previousClosingPrice;
   }
   //grabs the previous closing price
   double getPreviousClosingPrice(){
      return previousClosingPrice;
   }
   //sets the current price
   void setCurrentPrice(double currentPrice){
      this.currentPrice = currentPrice;
   }
   //grabs the current price
   double getCurrentPrice(){
      return currentPrice;
   }
}