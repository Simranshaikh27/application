package com.exception.trycatchblock;

public class Solution2 {
	
	public static void main(String[] args) {
		
	System.out.println("This statement will be executed");
	
	try {
		String s= args[0];
	
		System.out.println("value of s :"+s);
		
	} catch (Exception e) {
		// TODO: handle exception
		//e.printStackTrace();
		//System.out.println(e.getMessage());
		System.out.println("Exception handled");
	}
	System.out.println("this msg will be executed");
	}

}
