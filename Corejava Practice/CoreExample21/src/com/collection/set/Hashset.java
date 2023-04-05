package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashset {
	
	public static void main(String[] args) {
		
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	     System.out.println(set.size());
	     System.out.println(set.isEmpty());
	     System.out.println(set.contains(40));
	      System.out.println(set.remove(40));
	      System.out.println(set);
	
	
	
	System.out.println("---------------Iterator method-----------------");
	
	                  Iterator<Integer> itr = set.iterator();
	                  while(itr.hasNext()) {
	                	Integer i = itr.next();
	                	System.out.println(i);
	                  }
	         System.out.println("---------------For each loop-------------");
	
	                 for(Integer i:set) {
	                	 System.out.println(i);
	                 }
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}