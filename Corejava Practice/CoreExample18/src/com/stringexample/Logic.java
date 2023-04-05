package com.stringexample;

public class Logic {
	
	public static void main(String[] args) {
		
		String s="Simran";  //constant pool area
		String s1="Simran";
		String s2="simran";
		String s3=s;
	
		String s4= new String("Simran");//heap area
		String s5= new String("Simran");
		
		//1st way equals method
		
		//if content is same equal method shows true
		//if content is diffferent equal method shows false
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		System.out.println("=====================================");
		
		//2nd way operator method
		
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s==s4);
		System.out.println(s==s4);
		System.out.println(s==s4.intern());//convert s4 from  heap  to constant pool 
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s4==s5);//false...as it creates different memmory
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
