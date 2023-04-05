package com.arrayexample;

public class Demo {
	
	public static void main(String[] args) {
		
		//3rd way of writting array example 1
		
		char[]arrayOfChar= {'A','B','C','D'};
		
		System.out.println("Length of Array :"+arrayOfChar.length);
		
		System.out.println("========For Loop==========");
		
		for(int i =0;i<arrayOfChar.length;i++) {
			
			
			
			System.out.println(i);
			System.out.println(arrayOfChar[i]);
		}
		
		System.out.println("=========For Each Loop=============");
		
		for(char c:arrayOfChar) {
			System.out.println(c);
		}
		
		System.out.println("+++++++++++++Example 2+++++++++++++++++");
		
		//3rd way of writting array example 2
		
		String[]arrayOfString= {"Apple","Orange","Banana","Grapes"};
		
		System.out.println("================For Loop============");
		
		
		for(int i=0;i<arrayOfString.length;i++) {
			
			System.out.println(i);
			System.out.println(arrayOfString[i]);
		}
		System.out.println("================For Each Loop============");
		
		for(String s:arrayOfString) {
			System.out.println(s);
		}
		
		
		
	}
	
	
	
	
	
	

}
