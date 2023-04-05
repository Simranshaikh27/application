package com.exception.multipletrycatchblock;

public class Test {
	public static void main(String[] args) {
		System.out.println();
		
	try {
		String s=args[1];
		System.out.println(s);
		int i = Integer.parseInt(s);
			System.out.println("value of i :+i");
			int j=10/i;
			System.out.println(j);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("array index out of bound exception");
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e);
			
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("number format exception");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithematic exception");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
			System.out.println("main method end");
		
		}
		
		
		
		
		
		
		
		
		
	}
	
}
