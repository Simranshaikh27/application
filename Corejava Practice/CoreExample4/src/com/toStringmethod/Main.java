package com.toStringmethod;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=10;
		student.name="simran";
		student.adddress="pune";
		
		System.out.println(student.toString());
		     //or
		System.out.println(student);
	}
}
