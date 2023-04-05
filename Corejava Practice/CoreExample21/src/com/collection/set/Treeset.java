package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		Set<Integer>set=new TreeSet<>();
	    set.add(33);
	    set.add(44);
	    set.add(33);
	     set.add(44);
	     set.add(28);
	    // set.add(null);
	     
	     System.out.println(set);
		
	     System.out.println(set.size());
	     System.out.println(set.isEmpty());
	     System.out.println(set.contains(33));
	     System.out.println(set.contains(44));
	     System.out.println(set.remove(28));
	     System.out.println(set);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


