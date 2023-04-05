package com.abstractionproject;

public class B extends Demo {

	@Override
	public void m1() {
	System.out.println("implemented method in child class");
		
	}
	
	public void m2() {
		System.out.println("m2 method of child class");
	}

	public static void main(String[] args) {
		
		Demo demo = new B();
		demo.m1();
		
	
		
		B b = new B();
		b.m1();
		b.m2();
	}
}
