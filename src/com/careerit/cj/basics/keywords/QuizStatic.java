package com.careerit.cj.basics.keywords;

class IPOBid {
	
	private final String stockName;
	private final int quantity;
	private final double price;
	private final static String EXCHANGE; 
	
	static {
		if(QuizStatic.getExchangeName().isEmpty()) {
			EXCHANGE = "BSE";
		}else {
			EXCHANGE = QuizStatic.getExchangeName();
		}
	}

	public IPOBid(String stockName, int quantity, double price) {
		this.stockName = stockName;
		this.quantity = quantity;
		this.price = price;
		
	}

	public IPOBid increseQuantity(int num) {
		return new IPOBid(stockName, quantity + num, price);
	}

}

public class QuizStatic {
	public static int MONTHS_IN_A_YEAR = 12;
	static int a = 10;
	static {
		System.out.println("Static block - Hello");
	}
	static {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
			
				IPOBid obj = new IPOBid("MTAR", 26, 575);
				System.out.println(obj);
				
				IPOBid obj2 = obj.increseQuantity(26);
				System.out.println(obj2);
	}
	
	public static String getExchangeName() {
		return "NSE";
	}
}
