package com.exception.innertrycatchblock;

public class Test {

	public static void main(String[] args) {

		System.out.println("main method started");
		try {

			System.out.println("outer try block");
			Integer i = new Integer(20);
			System.out.println("value of i :" + i);
			try {

				System.out.println("inner try  block");
				int j = 10 / 0;
				System.out.println("value of j :" + j);

			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception

				System.out.println("inner catch block");
				e.printStackTrace();
			}

			// here the exception is Arithematic exception but in inner catch block there is
			// specified array out of bound which he cannot handle so it goes to outer block
			// ,So if in inner catch block we have specified arithemayic exception it will
			// terminate there itself and will not go to outerblock and print error in inner
			// catch block itself

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("outer catch block");
			e.printStackTrace();

		}
               System.out.println("main method complete");
	}

}
