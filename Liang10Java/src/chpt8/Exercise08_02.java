package chpt8;

public class Exercise08_02 {

	public static void main(String[] args) {
		Stock1 stock = new Stock1("ORCL", "Oracle Corp.");
		System.out.println(stock.name);
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		
		System.out.println("The previous price: " + stock.getPreviousClosingPrice());
		System.out.println("The current price: " + stock.getCurrentPrice());
		System.out.println("The change in the price is: " + stock.getChangePercent());

	}
}


class Stock1 {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock1(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}
	
	double getChangePercent(){
		return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
	}
	
	public double getPreviousClosingPrice() {
	    return previousClosingPrice;
	  }
	  
	 public double getCurrentPrice() {
	   return currentPrice;
	 }
	  
	 public void setCurrentPrice(double newCurrentPrice) {
	   currentPrice = newCurrentPrice;
	 }
	  
	 public void setPreviousClosingPrice(double newPreviousClosingPrice) {
	   previousClosingPrice = newPreviousClosingPrice;
	 }	
}
