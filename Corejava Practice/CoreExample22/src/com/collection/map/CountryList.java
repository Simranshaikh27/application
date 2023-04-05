package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountryList {

	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Solapur");

		List<String> Gujrat = new ArrayList<>();
		Gujrat.add("Surat");
		Gujrat.add("Vapi");
		Gujrat.add("Gandhinagar");

		Map<String, List<String>> india = new HashMap<>();
		india.put("Maharashtra", maharashtra);
		india.put("Gujrat", Gujrat);

		return india;

	}

	public static void main(String[] args) {

		CountryList country = new CountryList();
		Map<String, List<String>> india = country.addCountry();
		Set<String> keys = india.keySet(); // display key
		System.out.println(keys);

		System.out.println("----By iterator method----------");

		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String statelist = itr.next();
			System.out.println(statelist);

			List<String> cities = india.get(statelist); // values display
			Iterator<String> itr1 = cities.iterator();
			while (itr1.hasNext()) {
				String citynames = itr1.next();
				System.out.println(citynames);

			}

		}
		System.out.println("------------By FOREACH loop-------------");
		for (String statelist : keys) {
			System.out.println(statelist);
			List<String> cities = india.get(statelist);

			for (String citynames : cities)
				System.out.println(citynames);
		}
	}

}
