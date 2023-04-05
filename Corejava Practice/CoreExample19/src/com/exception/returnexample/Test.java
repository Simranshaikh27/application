package com.exception.returnexample;

import java.security.DomainCombiner;

public class Test {
	
	public static int m1() {
		
		System.out.println("main method of return example");
		
		try {
			
			int i = 10/2;
		//	System.out.println(i);
			
			return i;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception handle :"+e.getMessage());
			return -1;
		}finally {
			return 10;
		}
		
		
		
	}
public static void main(String[] args) {
	  System.out.println(m1());
}
}
