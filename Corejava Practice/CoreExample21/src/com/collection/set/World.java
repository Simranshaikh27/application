package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class World {

	public Set<Set<Set<String>>> addCountry() {

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

		Set<String> usa1 = new HashSet<>();
		usa1.add("Singapore");
		usa1.add("Florida");
		usa1.add("Turkey");

		Set<String> usa2 = new HashSet<>();
		usa2.add("London");
		usa2.add("Paris");
		usa2.add("NewYork");

		Set<Set<String>> usa = new HashSet<>();
		usa.add(usa1);
		usa.add(usa2);

		Set<Set<Set<String>>> world = new HashSet<>();
		world.add(india);
		world.add(usa);

		return world;

	}

	public static void main(String[] args) {

		World world = new World();
		Set<Set<Set<String>>> world1 = world.addCountry();
         System.out.println("-----------By Iterator method------");
		Iterator<Set<Set<String>>> itr = world1.iterator();
		while (itr.hasNext()) {
			Set<Set<String>> countrylist = itr.next();
			System.out.println(countrylist);

			Iterator<Set<String>> itr1 = countrylist.iterator();
			while (itr1.hasNext()) {

				Set<String> statelist = itr1.next();
				System.out.println(statelist);

				Iterator<String> itr2 = statelist.iterator();
               while(itr2.hasNext()) {
            String cities	 =  itr2.next();
            System.out.println(cities);
               }
			}

		}
		
		System.out.println("-------------By For each loop------------");
		
		for(Set<Set<String>>countrylist:world1) {
			System.out.println(countrylist);
			
			for(Set<String>statelist:countrylist) {
				System.out.println(statelist);
				
				for(String cities:statelist) {
					System.out.println(cities);
				}
			}
		}
	}

}
