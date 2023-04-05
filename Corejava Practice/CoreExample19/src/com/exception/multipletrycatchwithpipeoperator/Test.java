package com.exception.multipletrycatchwithpipeoperator;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
			
		
		String s= args[1];
		System.out.println(s);
		int i = Integer.parseInt(s);
		System.out.println("value of i :"+i);
		int c= 10/5;
		System.out.println("value of c :"+c);
		
		} catch (ArrayIndexOutOfBoundsException| NumberFormatException|ArithmeticException e) {
			// TODO: handle exception
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		System.out.println("main method completed");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
