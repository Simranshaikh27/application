package com.customexception;

import java.util.Scanner;

public class MainClass {

	public static void validatePin() throws AtmPinCheck {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit pin");
		String enterpin = sc.next();
		if (enterpin.equals("2701")) {
			System.out.println("Txn Successful...!!!");
		} else {
			throw new AtmPinCheck("Enter invalid pin please enter valid pin for txn..!!!");
		}

		sc.close();

	}
public static void main(String[] args) {
	try {
		validatePin();
		
		
		
	} catch (AtmPinCheck e) {
		// TODO: handle exception
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	
	
	
	
}
}
