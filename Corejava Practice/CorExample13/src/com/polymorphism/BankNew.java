package com.polymorphism;

public class BankNew {
	
	private final String createAccount(String s,float f) {
		
		System.out.println("Create Savings Account");
		
		return "savingsAccount";
		
		
	}

	protected final int createAccount(int i ,double d) {
		
		System.out.println("Create Current Account");
		
		return 10;
	}
	
	public static void main(String[] args) {
		
		BankNew b=new BankNew();
		b.createAccount("simran", 10.23f);
		b.createAccount(10, 10.123d);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
