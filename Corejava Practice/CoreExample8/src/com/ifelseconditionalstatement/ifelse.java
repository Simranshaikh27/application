package com.ifelseconditionalstatement;

public class ifelse {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		boolean flag=true;
		
		if(flag) {
			System.out.println("inside if condition");
		}else {
			System.out.println("inside else");
		}
		
		System.out.println("main method completed");
		
		System.out.println("----------------------------------------");
		
		int age=20;
		
		if(age>18) {
			System.out.println("you are eligible");
		}else {
			System.out.println("you are not eligible");
		}
		
		
		System.out.println("-------------------");
		
		int i=20;
		
		if(i>15) {
			System.out.println("i is greater than 15");
			
			}
		else if(i==15){
			System.out.println("i is equal to 15");
		
			}
		else {
			System.out.println("i is less than 15");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
