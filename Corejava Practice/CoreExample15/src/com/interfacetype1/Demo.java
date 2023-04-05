package com.interfacetype1;

public class Demo implements I10 {
	
	
	@Override
	public void add() {
		System.out.println("m1 method of i10 interface");
	}
	public static void main(String[] args) {
		
		Demo d= new Demo();
		
	      System.out.println(d.i);
	      d.add();
	
	        System.out.println(Demo.i);
	        
	        I10 i10 = new Demo();
	        i10.add();
	        
	        System.out.println(i10.i);
	        
	        System.out.println(i);
	        

	        
	        
	        
		
		
		
		
		
		
		
		
		
	

	
		
	}

}
