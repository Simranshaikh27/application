package com.interfacetype2;

public class A implements I,I1{
	
	@Override
	public void m1() {
	System.out.println("m1 method of I interface");
		
	}
	
	@Override
	public void m2() {
      System.out.println("m2 method of I1 interface");
		
	}
	
	public static void main(String[] args) {
		
		I i = new A();
		i.m1();
		
		I1 i1 = new A();
		i1.m2();
		
		A a = new A();
		a.m1();
		a.m2();
		
		
		
		
		
	}
	

}
