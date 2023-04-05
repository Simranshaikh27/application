package com.polymorphism;

public class Bank {
	
	
	private void createAccount(int i) {
		
		System.out.println("Create Savings Account");
	}

	private void createAccount(int i,int j) {
		
		System.out.println("Create current savings");
	}
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.createAccount(10);
		bank.createAccount(10, 10);
		
		
		
		
		
	}
	
	
	
	
}
