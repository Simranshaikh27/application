package com.exception.trycatchfinallyblock;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main method started.....");
		
		try {
			System.out.println("try block.....");
			String s="10";
			int i = Integer.parseInt(s);//converting int to string
			//Integer i=new Integer("sim");
			System.out.println("value of i :"+i);
			
			
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println("catch block.....");
				e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
