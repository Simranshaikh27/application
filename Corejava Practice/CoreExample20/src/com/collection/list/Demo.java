package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		al.add("Simran");
		al.add("Gaurav");
		al.add("sajjad");
		al.add("Aparna");

		// 500 names
		System.out.println(al);

		System.out.println("----By Using Iterator Interface -----");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("-----By ForEach Loop------");

		for (String s1 : al) {
			System.out.println(s1);
		}
		
		System.out.println("**************************************");

		System.out.println("-------Example 2---------");

          List<Integer>al2=new ArrayList<>();
          al2.add(10);
          al2.add(20);
          al2.add(30);
          
          System.out.println(al2);
          
          System.out.println("----By Iterator Interface---------");
	
                   Iterator<Integer> itr1  = al2.iterator();
             
               while(itr1.hasNext()) {
            	   Integer i   = itr1.next();
            	   System.out.println(i);
               }
               System.out.println("-----By ForEach Loop------");
                    
               for(Integer i1:al2) {
            	   System.out.println(i1);
               }
	
	
	
	
	
	
	
	
	}

	
	
	
	
}
