package com.stringexample;

public class Demo {

	public static void main(String[] args) {

		// 1st way constant pool literal object(no new keyword is reqiuired for literal
		// object for storing by creating memmory as new keyword whenever used creates
		// new memmory)

		String s = "java";
		String s1 = "Programming";

		s = s.concat(s);
		System.out.println(s);

		s = s.concat(s1);
		System.out.println(s);

		s1 = s1.concat(s1);
		System.out.println(s1);
		
		System.out.println("=========================================");

		// 2nd way heap method with new keyword

		String str = new String("java");
		String str1 = new String("programming");
	    str1	=str.concat(str1);
		System.out.println(str1);
	

	}

}
