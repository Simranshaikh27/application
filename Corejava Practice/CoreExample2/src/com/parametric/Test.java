package com.parametric;

public class Test {
	
	public void m1() {
		System.out.println("m1 method ");
	}
	
	public void m2(int i) {
	System.out.println("m2 method with single parameter");
	System.out.println(i);
	}

 
	public void m3(int i,String s) {
		System.out.println("m3 method with double parameter");
		System.out.println(i +" "+s);
		
		
	}

	public void m4(boolean b,char c,double d,float f) {
		System.out.println("m4 method with multiple parameters");
		System.out.println(b +" " + c+" "+d+" "+f);
		
	}


	public void m5(byte b) {
		System.out.println("m5 method ");
		System.out.println(b);
	}

	public void m6(short s) {
		System.out.println("m6 method");
		System.out.println(s);
	}

	public void m7(long l) {
		System.out.println("m6 method ");
		System.out.println(l);
		
	}
public static void main(String[] args) {
	
	Test t = new Test();
	t.m1();
	t.m2(10);
	t.m3(10,"simran");
	t.m4(true, 'G', 100.123, 12.45f);
	byte b=100;
	t.m5(b);
	short s=1000;
	t.m6(s);
	long l=10000;
	t.m7(l);
	
	
	
	
	
	
}


}
