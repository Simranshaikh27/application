package com.superthiskeyword;

public class B extends A {
	
	int j=20;
	
	public B() {
		System.out.println("DEFAULT CONSTRUCTOR OF CHILD CLASS B");
	}

	public void m2() {
		System.out.println("m2 method of class B");
		
		System.out.println(super.i);
		super.m1();
	
		
		System.out.println("===============================");
	}
	
	
	
	public void m3() {
		System.out.println("m3 method of B class");
		System.out.println(this.j);
		this.m2();
	
	}
	
	public static void main(String[] args) {
		
		B b = new B();
	     b.m2();
	     b.m3();
	}
}
