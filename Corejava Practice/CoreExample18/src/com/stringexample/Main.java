package com.stringexample;

public class Main {
	public static void main(String[] args) {

		String str = "Hello How Are You ";

		String[] strArray = str.split(" ");

		for (String s : strArray) {
			System.out.println(s);
		}

		System.out.println("===================================");
		String str2 = "a::e::i::o::u";

		String[] strarray = str2.split("::");

		for (String s1 : strarray) {
			System.out.println(s1);
		}

		System.out.println("===================================");

		// length of string and indexof

		String str3 = " Simran ";
		System.out.println(str3.length());
		int i1 = str3.indexOf("n");
		int i2 = str3.indexOf("p");

		System.out.println("index of i " + i1);
		System.out.println("index of i " + i2);

		// intern()

		String str4 = new String("Simran").intern();
		System.out.println(str4);

	}

}
