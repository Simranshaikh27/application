package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {

	public List<List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Solapur");

		List<String> Gujrat = new ArrayList<>();
		Gujrat.add("vapi");
		Gujrat.add("surat");
		Gujrat.add("Gandhinagar");

		List<List<String>> india = new ArrayList<>();
		india.add(maharashtra);
		india.add(Gujrat);

		return india;

	}

	public static void main(String[] args) {

		Country country = new Country();
		List<List<String>> india = country.addCountry();

		Iterator<List<String>> itr1 = india.iterator();
		while (itr1.hasNext()) {
			List<String> statelist = itr1.next();
			System.out.println(statelist);

			Iterator<String> itr2 = statelist.iterator();
			while (itr2.hasNext()) {
				String cities = itr2.next();
				System.out.println(cities);
			}

		}
		   System.out.println("-------------for each loop------------");  
		   
		   for(List<String>statelist:india) {
			   System.out.println(statelist);
			   
			   for(String cities:statelist)
				   System.out.println(cities);
		   }
	}

}
