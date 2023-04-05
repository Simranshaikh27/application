package com.statickeyword;

public class Student {

	int id;
	
	String name;
	
	static String collegeName="PCCOEC&R";
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.id=101;
		s.name="simran";
		
		
	
		Student s1= new Student();
		s1.id=102;
		s1.name="sajjad";
		s1.collegeName="DYP";
	
		Student s2= new Student();
		s2.id=103;
		s2.name="gaurav";
		
		
		
		
		System.out.println(s.id+" "+s.name+" "+s.collegeName);
		System.out.println(s1.id+" "+s1.name+" "+s1.collegeName);
		System.out.println(s2.id+" "+s2.name+" "+s2.collegeName);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
