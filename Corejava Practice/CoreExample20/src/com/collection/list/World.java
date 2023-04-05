package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {

	List<List<List<String>>> addCountry() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("solapur");

		List<String> gujrat = new ArrayList<>();
		gujrat.add("vapi");
		gujrat.add("surat");
		gujrat.add("gandhinagar");

		List<List<String>> india = new ArrayList<>();
		india.add(maharashtra);
		india.add(gujrat);

		List<String> usa1 = new ArrayList<>();
		usa1.add("florida");
		usa1.add("Turkey");
		usa1.add("Honkong");

		List<String> usa2 = new ArrayList<>();
		usa2.add("Paris");
		usa2.add("NewYork");
		usa2.add("London");

		List<List<String>> usa = new ArrayList<>();
		usa.add(usa1);
		usa.add(usa2);

		List<List<List<String>>> world = new ArrayList<>();
		world.add(india);
		world.add(usa);

		return world;

	}

	public static void main(String[] args) {

		World world = new World();
		List<List<List<String>>> world1 = world.addCountry();
		Iterator<List<List<String>>> itr1 = world1.iterator();
		while (itr1.hasNext()) {
			List<List<String>> countrylist = itr1.next();
			System.out.println(countrylist);

			Iterator<List<String>> itr2 = countrylist.iterator();

			while (itr2.hasNext()) {
				List<String> statelist = itr2.next();
				System.out.println(statelist);

				Iterator<String> itr3 = statelist.iterator();
				while (itr3.hasNext()) {
					String cities = itr3.next();
					System.out.println(cities);
				}
			}

		}
		System.out.println("-----For each loop-----");
        for(List<List<String>>countrylist:world1) {
     	   System.out.println(countrylist);
     	   
     	   for(List<String>statelist:countrylist) {
     		   System.out.println(statelist);
     		   
     		  for(String cities:statelist) {
     			  System.out.println(cities);
     		  }
	
	
	}

        }
	}
}
