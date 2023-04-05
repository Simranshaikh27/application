package com.FailsafeandFailFast;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Failsafe {

	public static void main(String[] args) {

		System.out.println("---------------------For LIST--------------");
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			al.add(90);
			Integer i = itr.next();

			System.out.println(i);
			System.out.println(al);
		}

		System.out.println("------For Set-----------------");

		CopyOnWriteArraySet<String> al1 = new CopyOnWriteArraySet<>();
		al1.add("simran");
		al1.add("gaurav");
		al1.add("sajjad");

		Iterator<String> itr1 = al1.iterator();
		while (itr1.hasNext()) {
			String s = itr1.next();
			al1.add("ajay");
			System.out.println(s);
			System.out.println(al1);
		}

		System.out.println("-----For Map----------");
		
		ConcurrentHashMap<Integer, String>al2=new ConcurrentHashMap<>();
		al2.put(1, "simran");
		al2.put(2, "sajjad");
		al2.put(3, "megha");
		
		                   Set<Integer> key  =al2.keySet();
		                   System.out.println(key);

		                   
		             Iterator<Integer>itr2 =  key.iterator();
		             while(itr2.hasNext()) {
		            	Integer i =itr2.next();
		            	al2.put(4, "gaurav");
		            	System.out.println(i);
		            	System.out.println(al2);
		             }
	}


	
	
	
}
