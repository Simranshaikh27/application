package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Country {

	public Set<Set<String>> addCountry() {

		Set<String> maharashtra = new HashSet<>();

		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Solapur");

		Set<String> Gujrat = new HashSet<>();
		Gujrat.add("vapi");
		Gujrat.add("Ahemdabad");
		Gujrat.add("Surat");

		Set<Set<String>> india = new HashSet<>();
		india.add(maharashtra);
		india.add(Gujrat);

		return india;
	}

	public static void main(String[] args) {

		Country country = new Country();
		Set<Set<String>> india = country.addCountry();
           System.out.println("------------By Iterator method-------------");
		Iterator<Set<String>> itr = india.iterator();
		while (itr.hasNext()) {
			Set<String> statelist = itr.next();
			System.out.println(statelist);

			Iterator<String> itr2 = statelist.iterator();
			while (itr2.hasNext()) {
				String cities = itr2.next();
				System.out.println(cities);
			}

		}
            System.out.println("------------By For each loop------------");   
            
            for(Set<String>statelist:india) {
            	System.out.println(statelist);
            	
            	for(String cities:statelist) {
            		System.out.println(cities);
            	}
            }
	}

}
