package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldList {

	public Map<String, Map<String, List<String>>> addCountries() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("solapur");

		List<String> gujrat = new ArrayList<>();
		gujrat.add("vapi");
		gujrat.add("gandhinagar");
		gujrat.add("surat");

		Map<String, List<String>> india = new HashMap<>();
		india.put("GUJRAT", gujrat);
		india.put("MAHARASHTRA", maharashtra);

		List<String> usa1 = new ArrayList<>();
		usa1.add("London");
		usa1.add("Paris");
		usa1.add("Newyork");

		List<String> usa2 = new ArrayList<>();
		usa2.add("Florida");
		usa2.add("Colordo");
		usa2.add("France");

		Map<String, List<String>> usa = new HashMap<>();
		usa.put("USA1", usa1);
		usa.put("USA2", usa2);

		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("USA", usa);
		world.put("INDIA", india);

		return world;

	}

	public static void main(String[] args) {

		WorldList worldlist = new WorldList();
		Map<String, Map<String, List<String>>> world = worldlist.addCountries();
		Set<String> key = world.keySet();
		System.out.println(key);
		System.out.println("By iterrator method");
		Iterator<String> itr = key.iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			System.out.println(keys);
			Map<String, List<String>> countrylist = world.get(keys);
			System.out.println(countrylist);

			Set<String> country = countrylist.keySet();
			System.out.println(country);
                    Iterator<String> itr1 = country.iterator();
                    while(itr1.hasNext()) {
                   String state =itr1.next();
                   System.out.println(state);
                   
                 List<String>statelist=  countrylist.get(state);
                   System.out.println(statelist);
                   
                  Iterator<String>itr2 =statelist.iterator();
                  while(itr2.hasNext()) {
                	String cityname = itr2.next();
                	System.out.println(cityname);
                  }
                    
                    }
		}

		System.out.println("By Foreach loop");
		for(String keys:key) {
			System.out.println(keys);
       Map<String, List<String>>countrylist  =world.get(keys);
     
        }
    	   
       }
		}
		
		
		
		
		
		
		
	


