package com.example.demo.package1;

public class Bank {
	static int currentBalance=1000;
	
	public void deposit(int amount) {
		currentBalance += amount;
	}
	

	public static void greetCustomer() {
		System.out.println("Hello welcome to our banking application");
	}
	
	public static void withdrawal(int amount) {
		currentBalance -= amount;
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
		
	public static void main(String args[]) {
		greetCustomer();
		
		Bank bank = new Bank();
		bank.deposit(1000);
		System.out.println("balance before withdrawal "+currentBalance);
		
		withdrawal(500);
		System.out.println("balance after withdrawal "+currentBalance);
		
		System.out.println(bank.getCurrentBalance());
		
	}

}
