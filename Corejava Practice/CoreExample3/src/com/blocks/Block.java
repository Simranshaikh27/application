package com.blocks;

public class Block {
	
	static {
		System.out.println("222");
		
		}
	static {
		System.out.println("223");
	}
   public Block() {             
	   System.out.println("333");
   }

   {
	   System.out.println("444");
   }

   public void m1() {
	   System.out.println("666");
   }

   public static void main(String[] args) {
	   System.out.println("111");
	
	   Block b= new Block();
	   Block b1 = new Block();
	   b1.m1();
	   b.m1();
}

   //222 223 111  444 333 444 333 666 666





}
