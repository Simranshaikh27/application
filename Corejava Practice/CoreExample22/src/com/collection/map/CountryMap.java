package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMap {

	Map<String, Map<String, Integer>> addCountry() {

		Map<String, Integer> maharashtra = new HashMap<>();
		maharashtra.put("pune", 101);
		maharashtra.put("mumbai", 102);
		maharashtra.put("Nagpur", 103);

		Map<String, Integer> Gujrat = new HashMap<>();
		Gujrat.put("Surat", 104);
		Gujrat.put("Vapi", 105);
		Gujrat.put("Gandhinagar", 106);

		Map<String, Map<String, Integer>> india = new HashMap<>();
		india.put("Maharashtra", maharashtra);
		india.put("Gujrat", Gujrat);

		return india;

	}

	public static void main(String[] args) {

		CountryMap country = new CountryMap();
		Map<String, Map<String, Integer>> india = country.addCountry();
		Set<String> keys = india.keySet();
		//System.out.println(keys);
		Iterator<String> itr1 = keys.iterator();
		while (itr1.hasNext()) {
			String key = itr1.next();
			System.out.println(key);

			Map<String, Integer> statelist = india.get(key);
			System.out.println(statelist);
                Set<String>keys1  =statelist.keySet();
               // System.out.println(keys1);
                             Iterator<String> itr2  = keys1.iterator();
                             while(itr2.hasNext()) {
                            String cityname	= itr2.next();
                            System.out.println(cityname+" "+statelist.get(cityname));
                            
                                       
                             }
                            
                            
                         
                             }
		}

	}


