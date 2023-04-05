package com.overiding;

public class Subclass extends SuperClass {

	int j=20;
	
	@Override
	public void m1() {
		System.out.println("m1 method overrided");
	}
	
	public void m2() {
		System.out.println("m2 method of subclass");
	}
	

@Override
public void m3() {
	System.out.println("m3 method overrided");
}

public static void main(String[] args) {
	
	System.out.println("parent class object");
	
	SuperClass sup = new SuperClass();
	System.out.println(sup.i);
	sup.m1();
	sup.m3();
	System.out.println("=================================");
	
	System.out.println("Parent child mix object");
	
	SuperClass sup1 = new Subclass();
	System.out.println(sup1.i);
	sup1.m1();
	sup1.m3();
	
	System.out.println("=================================");
	
	System.out.println("Child class object");
	
	Subclass sub = new Subclass();
	System.out.println(sub.i);
	System.out.println(sub.j);
	sub.m1();
	sub.m2();
	sub.m3();
	
	
	
	
	
	
	
	
	
	
}







}
