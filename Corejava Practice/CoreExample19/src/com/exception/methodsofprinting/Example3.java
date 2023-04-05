package com.exception.methodsofprinting;

public class Example3 {

	public static void main(String[] args) {
		System.out.println();
		
	try {
		String s=args[1];
		System.out.println(s);
		int i = Integer.parseInt(s);
			System.out.println("value of i :+i");
			int j=10/i;
			System.out.println(j);
			
         }catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
        	// System.out.println(e.getMessage());
        	 System.out.println(e);
		
			System.out.println("main method end");
		
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
