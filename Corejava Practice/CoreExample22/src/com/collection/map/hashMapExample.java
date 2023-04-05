package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {
     //Maintains  key order so put null value at zero index
	
	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<>();
		map.put(101, "LMN");
		map.put(102, "PQR");
		map.put(104, "XYZ");
		map.put(103, "ABC");
		map.put(null, "KHP");//always store on 0 index
		map.put(106, null); //show on particular index only
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(104));
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("ABC"));
		System.out.println(map.containsValue("abcd"));
		System.out.println(map.containsKey(105));
		System.out.println(map.remove(104, "ABC"));
		
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
