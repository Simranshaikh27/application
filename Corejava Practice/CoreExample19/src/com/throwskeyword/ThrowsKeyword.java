package com.throwskeyword;

public class ThrowsKeyword {

	public static void validateAge(int age) {

		System.out.println("entry into the  validate method");
		if (age < 18) {
			throw new ArithmeticException("person is not eligible to create bank account please visit bank after 18");

		} else {
			System.out.println("person is eligible to create bank account..!!");

		}

	}

	public static void main(String[] args) {  //throws Arithematic exception

		try {

			validateAge(15);

		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		// validateAge(10);//for this write throws method in main method
		// to get handled by jvm

	}
}
