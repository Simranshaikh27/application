package com;

public class Laptop {

	public int ramsize = 16;  //global variable

	public String company = "Dell";

	public static void main(String[] args) {

		Laptop lap = new Laptop();

		System.out.println(lap.ramsize);
		System.out.println(lap.company);
		
		lap.m1();
		
		int i= 100;
		System.out.println(i);

	}

	public void m1() {
		
		System.out.println("Laptop is starting");
		
		String password = "admin@123";  //local variable
		System.out.println("PASSWORD : " +password);//static field no need of object
				
	}
	
	
	
	
	
	
	
	
}
