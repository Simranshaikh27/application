package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMap {

	public Map<String, Map<String, Map<String, Integer>>> addCountry() {

		Map<String, Integer> maharashtra = new HashMap<>();
		maharashtra.put("pune", 101);
		maharashtra.put("nashik", 102);
		maharashtra.put("Kolhapur", 103);

		Map<String, Integer> gujrat = new HashMap<>();
		gujrat.put("vapi", 104);
		gujrat.put("ahemdabad", 105);
		gujrat.put("surat", 106);

		Map<String, Map<String, Integer>> india = new HashMap<>();
		india.put("Maharashtra", maharashtra);
		india.put("Gujrat", gujrat);

		Map<String, Integer> usa1 = new HashMap<>();
		usa1.put("London", 001);
		usa1.put("Paris", 002);
		usa1.put("NewYork", 003);

		Map<String, Integer> usa2 = new HashMap<>();
		usa2.put("Turkey", 004);
		usa2.put("Florida", 005);
		usa2.put("Colordo", 006);

		Map<String, Map<String, Integer>> usa = new HashMap<>();
		usa.put("USA1", usa1);
		usa.put("USA2", usa2);

		Map<String, Map<String, Map<String, Integer>>> world = new HashMap<>();
		world.put("India", india);
		world.put("Usa", usa);

		return world;

	}

	public static void main(String[] args) {

		WorldMap world = new WorldMap();
		Map<String, Map<String, Map<String, Integer>>> world1 = world.addCountry();
		Set<String> keys = world1.keySet();
		System.out.println(keys);

		System.out.println("-----By Iterator method------------");
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key);

			Map<String, Map<String, Integer>> countrylist = world1.get(key);
			System.out.println(countrylist);

			Set<String> keys1 = countrylist.keySet();
			System.out.println(keys1);

			Iterator<String> itr1 = keys1.iterator();
			while (itr1.hasNext()) {
				String key1 = itr1.next();
				System.out.println(key1);

				Map<String, Integer> statelist = countrylist.get(key1);
				System.out.println(statelist);
				Set<String> keys2 = statelist.keySet();
				System.out.println(keys2);
				Iterator<String> itr2 = keys2.iterator();
				while (itr2.hasNext()) {
					String cityname = itr2.next();
					System.out.println(cityname + " " + statelist.get(cityname));

				}

			}

		}

//	             System.out.println("by for each");
//	
//	       for(String key :keys) {
//	    	   System.out.println(key);
//	    	       Map<String, Map<String, Integer>>countrylist = world1.get(key);
//	        for(String key1:keys1) {
//	        	System.out.println(key1);
//	       Map<String, Integer>statelist   = countrylist.get(key1);
//	       
//	       for(String key2:keys2) {
//	    	   System.out.println(key2);
//	    	   String cityname  =  statelist.get(key2);
//	    	   
//	       }
	        }
	       
	       
	       
	//       }
	
	
	
	
	
	
	
	
	
	
	}


