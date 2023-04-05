package com.arrayexample;

public class Test {
	
	public static void main(String[] args) {
		
		//1st way of writting array
		
		int[]arrayOfInts=new int[5];
		arrayOfInts[0]=10;
		arrayOfInts[1]=20;     //index start from 0
		arrayOfInts[2]=30;      //length start from 1
		arrayOfInts[3]=40;
		arrayOfInts[4]=50;
		
		
		System.out.println("length of array : "+ arrayOfInts.length);
		System.out.println(arrayOfInts[0]);
		System.out.println(arrayOfInts[1]);
		
		//2nd way of writting array
		
		double[]arrayOfDouble=new double[] {10.123,45.3,89.53};
		System.out.println("length of array : "+arrayOfDouble.length);
		System.out.println(arrayOfDouble[0]);
		System.out.println(arrayOfDouble[1]);
		System.out.println(arrayOfDouble[2]);
		
		System.out.println("======================================");
		
		//Array Using For loop
		
		
		for(int i=0;i<arrayOfDouble.length;i++) {
			
			System.out.println(i);//showing index
			
			System.out.println(arrayOfDouble[i]);//showing index values
			
		}
		
		
		
	}
	
	
	
	
	

}
