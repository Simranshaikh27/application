package com.exception.trycatchblock;

public class Solution1 {
	
	public static void main(String[] args) {
	
		System.out.println("This statement will be executed");
		try {
			
			
			Integer i = new Integer("ABC");
		
			System.out.println("value of i :"+i);
			
		} catch (Exception e) {
			// TODO: handle exception
	           e.printStackTrace();
		
		}
		
		System.out.println("This statement will be executed");
		
		
		
		
		
		
	}

}
