package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllUniversityMap {

	Map<String, Map<String, Map<String, Integer>>> addUniversity() {

		Map<String, Integer> Sppu = new HashMap<>();
		Sppu.put("Engineering", 11);
		Sppu.put("Architechture", 12);
		Sppu.put("Pharmacy", 13);

		Map<String, Integer> ShivajiUniversity = new HashMap<>();
		ShivajiUniversity.put("BBA", 14);
		ShivajiUniversity.put("BCOM", 15);
		ShivajiUniversity.put("BCA", 16);

		Map<String, Integer> MumbaiUniversity = new HashMap<>();
		MumbaiUniversity.put("MBA", 17);
		MumbaiUniversity.put("MCOM", 18);
		MumbaiUniversity.put("CA", 19);

		Map<String, Map<String, Integer>> maharashtrUniversity = new HashMap<>();
		maharashtrUniversity.put("MUMBAIUNIVERSITY", MumbaiUniversity);
		maharashtrUniversity.put("SPPU", Sppu);
		maharashtrUniversity.put("SHIVAJIUNIVERSITY", ShivajiUniversity);

		Map<String, Map<String, Map<String, Integer>>> allUniversity = new HashMap<>();
		allUniversity.put("MAHARASHTRA", maharashtrUniversity);

		return allUniversity;

	}

	public static void main(String[] args) {

		AllUniversityMap alluniversitymap = new AllUniversityMap();

		Map<String, Map<String, Map<String, Integer>>> alluniversity = alluniversitymap.addUniversity();

		Set<String> key = alluniversity.keySet();
		System.out.println(key);
		Iterator<String> itr1 = key.iterator();
		while (itr1.hasNext()) {
			String keys = itr1.next();
			System.out.println(keys);

			Map<String, Map<String, Integer>> university1 = alluniversity.get(keys);
			Set<String> key1 = university1.keySet();
			Iterator<String> itr2 = key1.iterator();
			while (itr2.hasNext()) {
				String keys1 = itr2.next();
				System.out.println(keys1);

				Map<String, Integer> university2 = university1.get(keys1);
				Set<String> key3 = university2.keySet();
				Iterator<String> itr3 = key3.iterator();
				while (itr3.hasNext()) {
					String keys3 = itr3.next();
					System.out.println(keys3 + "   " + university2.get(keys3));
				}
			}

		}/*
                                for(String keys:key) {
                                	System.out.println(keys);
                                	           Map<String, Map<String, Integer>>university1 = alluniversity.get(keys);
                                	           for(String keys1:key1) {
                                	        	         Map<String, Integer>  university2  = university1.get(keys1);
                                	        	         System.out.println(keys1);
                                	          for(:)
                                	           }
                                }
	}
*/
	}
}
