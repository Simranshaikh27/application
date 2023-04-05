package com.covariant;

public class Test {
	
	public X m1() {
		
	X x = new X();
	Y y = new Y();
	Z z = new Z();
	
    return z;
	}
	public static void main(String[] args) {
		Test test = new Test();
		
		
		X x=test.m1();
		System.out.println(x.a);
		x.m1();
		
		Y y=(Y) test.m1();
		System.out.println(y.a);
		System.out.println(y.b);
		y.m1();
		y.m2();
		
		Z z = (Z) test.m1();
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
		z.m1();
		z.m2();
		z.m3();
		
		
		
		
		
	}

	
	//For covarience application parent child relation is must
	//In single class method multiple data can be return it is possible with the help of covariance
}
