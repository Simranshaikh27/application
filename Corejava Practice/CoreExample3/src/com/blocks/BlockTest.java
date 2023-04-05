package com.blocks;

public class BlockTest {

	static {
		System.out.println("Static block called");
	}

	public BlockTest() {
		System.out.println("Default Constructor called");
	}

	{
		System.out.println("Non static block");
	}

	public void m1() {
		System.out.println("m1 method of block test");
	}

	public static void main(String[] args) {
		System.out.println("main method called....");
		BlockTest t = new BlockTest();
		BlockTest t1 = new BlockTest();
	
		t.m1();
		t1.m1();

	}

}
