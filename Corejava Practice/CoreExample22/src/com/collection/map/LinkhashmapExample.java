package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkhashmapExample {
	
	//Do not maintain key order so not put null value at 0 index
	
	public static void main(String[] args) {
		
		Map<String, Integer>map= new LinkedHashMap<>();
		map.put("A", 45);
		map.put("D", 35);
		map.put("C", 85);
		map.put("R", 55);
		map.put(null, 90);
		map.put("G", 100);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("C"));
		System.out.println(map.get("g"));
		System.out.println(map.containsKey("C"));
		System.out.println(map.containsKey("c"));
		System.out.println(map.containsValue(45));
		System.out.println(map.containsValue(50));
		System.out.println(map.remove("R", 55));
		
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
