package com.stringemethods;

public class MethodOfString {

	public static void main(String[] args) {

		// TRIM

		String s = "   Hi I Am Simran ";
		System.out.println(s);

		s = s.trim();
		System.out.println(s);

		// UPPERCASE
		s = s.toUpperCase();
		System.out.println(s);

		// LOWERCASE
		s = s.toLowerCase();
		System.out.println(s);

		// Split with double parameter
		// same as regular split only in this u can set the limit for no of pieces of
		// string
System.out.println("==================================================");
		
String str = "Split with double parameter";

		String[] string = str.split(" ", 3);

		for (String st : string) {
			System.out.println(st);
		}
			
		//Sub-String
		
	String s1 = "ExponentClasses";
	
	System.out.println(s1.substring(0, 15));
	System.out.println(s1.substring(3, 8));
	System.out.println(s1.substring(0));
		
		//Replace
	
	
	String string2= new String("Welcome to exponent classes Here we are to learn java");
	        System.out.println(string2);
	         string2= string2.replace("to", "was");
	          System.out.println(string2);
	          
	         
	          
	         
		
	          
	    //ReplaceALL
	          
	          String string3=new String("John is a clever student,John is a class topper");
	          System.out.println(string3);
	          string3=string3.replaceAll("John", "Riyansh");
	          System.out.println(string3);
	          
	          //ValueOf
	          
	          System.out.println(" ");
	          int a=30;
	          String s4=String.valueOf(a);
	          System.out.println(s4);
	          System.out.println(s4 + 20);
	          
	          
	          
	     
		
		
		
		
		

	}

}
