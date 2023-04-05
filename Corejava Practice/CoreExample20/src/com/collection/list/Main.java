package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List al = new ArrayList<>();
		
		al.add(10);//0
		al.add(20);//1
		al.add(30);//2
		al.add(40);//3
		al.add(50);//4
		al.add(null);//5
		al.add(null);//6
		al.add("abc");//7
		al.add(10.4f);//8
		al.add('G');//9
		
		//Methods of list interface....
		
		System.out.println(al);
		System.out.println("size :"+al.size());
		System.out.println(al.get(1));
		System.out.println(al.get(4));
		System.out.println(al.get(6));
		//System.out.println(al.get(10));
		System.out.println(al.isEmpty());
		System.out.println(al.contains(30));
		al.remove(2);
		System.out.println(al);
		
		
		//Allows duplicate 
		//Maintain index
	    //Allows multiple null values
		
		
		
		
		
		
	}

}
