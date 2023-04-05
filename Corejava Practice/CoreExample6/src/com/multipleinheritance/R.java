package com.multipleinheritance;

public class R extends Q {
int k=30;
	
	public void m3() {
		System.out.println("m3 method of R class");
	}

	public R() {
		System.out.println("Default const of R class");
	}
	
	
public static void main(String[] args) {
	
	P p = new P();//parent class object
	System.out.println(p.i);
	p.m1();
	
	Q q = new Q();//child class object
	System.out.println(q.i);
	System.out.println(q.j);
	q.m1();
	q.m2();
	
	R r = new R();// child class object
	System.out.println(r.i);
	System.out.println(r.j);
	System.out.println(r.k);
	r.m1();
	r.m2();
	r.m3();
	
	
	
	
}

}
