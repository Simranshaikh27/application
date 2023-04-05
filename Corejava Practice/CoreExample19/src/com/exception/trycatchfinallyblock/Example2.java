package com.exception.trycatchfinallyblock;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		try {
			
			System.out.println("try block");
			
			int i=10/0;
			System.out.println("value of i :"+i);
			
	//	}//catch (Exception e) {
				// TODO: handle exception
				//System.out.println(e.getMessage());
			
		}finally {
			System.out.println("finally block");
		}
		
		
		
		
		
		
		
		
	}
}
