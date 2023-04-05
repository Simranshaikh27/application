package com.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
	
	//Maintains order but null elements and duplicate key not allowed value is allowed
	public static void main(String[] args) {
		
	
	
	Map<String, Integer> map=new TreeMap<String,Integer>();
	map.put("A", 45);
	map.put("E", 35);
	map.put("C", 55);
	//map.put("R", null);   null elements not allowed
	map.put("S", 60);
	map.put("G", 90);
	map.put("G", 90);
	
	System.out.println(map);
	System.out.println(map.size());
	System.out.println(map.get("C"));
	System.out.println(map.get("g"));
	System.out.println(map.containsKey("C"));
	System.out.println(map.containsKey("c"));
	System.out.println(map.containsValue(45));
	System.out.println(map.containsValue(50));
	System.out.println(map.remove("S", 60));
	
	System.out.println(map);
	
	}      

}
