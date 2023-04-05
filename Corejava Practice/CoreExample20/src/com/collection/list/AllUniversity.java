package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllUniversity {

	public List<List<List<String>>> addUniversity() {

		List<String> SPPU = new ArrayList<>();
		SPPU.add("Engineering");
		SPPU.add("Architechture");
		SPPU.add("Pharmacy");

		List<String> ShivajiUniversity = new ArrayList<>();
		ShivajiUniversity.add("BCA");
		ShivajiUniversity.add("BBA");
		ShivajiUniversity.add("BCOM");

		List<String> MumbaiUniversity = new ArrayList<>();
		MumbaiUniversity.add("MBBS");
		MumbaiUniversity.add("Interior Designing");
		MumbaiUniversity.add("MCA");

		List<List<String>> maharasshtrauniversity = new ArrayList<>();
		maharasshtrauniversity.add(SPPU);
		maharasshtrauniversity.add(ShivajiUniversity);
		maharasshtrauniversity.add(MumbaiUniversity);

		List<List<List<String>>> alluniversity = new ArrayList<>();
		alluniversity.add(maharasshtrauniversity);

		return alluniversity;

	}

	public static void main(String[] args) {

		AllUniversity alluniversity = new AllUniversity();
		System.out.println("---------------------Iterator method------------------");
		List<List<List<String>>> allUniversity = alluniversity.addUniversity();
		Iterator<List<List<String>>> itr1 = allUniversity.iterator();
		while (itr1.hasNext()) {
			List<List<String>> uni1 = itr1.next();
			System.out.println(uni1);

			Iterator<List<String>> itr2 = uni1.iterator();
			while (itr2.hasNext()) {
				List<String> uni2= itr2.next();
				System.out.println(uni2);
				Iterator<String> itr3 = uni2.iterator();
				while (itr3.hasNext()) {
					String uni3 = itr3.next();
					System.out.println(uni3);

				}
			}
		}
                         System.out.println("--------------------for each loop----------------");
                         
                         for(List<List<String>>uni1:allUniversity) {
                        	 System.out.println(uni1);
                        	 
                        	 for(List<String>uni2:uni1) {
                        		 System.out.println(uni2);
                        		 
                        		 for(String uni3:uni2) {
                        			 System.out.println(uni3);
                        			 
                        			 
                        		 }
                        	 }
                         }
		
		
		
	}
}
