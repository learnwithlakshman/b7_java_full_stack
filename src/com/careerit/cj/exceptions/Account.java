package com.careerit.cj.exceptions;

public class Account {

		double balance;
		
		public void withDraw(int amount) {
			
				if(amount > balance) {
					throw new InsufficientFundsException("You don't have sufficient balance and your balance :"+balance);
				}
				
				
				this.balance -= amount;
				System.out.println("The current balance is :"+balance);
		}
}
