package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllUniversity {

	public Set<Set<Set<String>>> addUniversity() {

		Set<String> SPPU = new HashSet<>();
		SPPU.add("Architetechture");
		SPPU.add("Engineering");
		SPPU.add("Pharmacy");

		Set<String> ShivajiUniversity = new HashSet<>();
		ShivajiUniversity.add("BCOM");
		ShivajiUniversity.add("BBA");
		ShivajiUniversity.add("BCA");

		Set<String> MumbaiUniversity = new HashSet<>();
		MumbaiUniversity.add("MBBS");
		MumbaiUniversity.add("MBA");
		MumbaiUniversity.add("Interior Designing");

		Set<Set<String>> maharashtraUniversity = new HashSet<>();
		maharashtraUniversity.add(SPPU);
		maharashtraUniversity.add(ShivajiUniversity);
		maharashtraUniversity.add(MumbaiUniversity);

		Set<Set<Set<String>>> allUniversity = new HashSet<>();
		allUniversity.add(maharashtraUniversity);
		return allUniversity;

	}

	public static void main(String[] args) {

		AllUniversity alluniversity = new AllUniversity();
		Set<Set<Set<String>>> alluniversity1 = alluniversity.addUniversity();

		System.out.println("---------------By Iterator Method---------------");
		Iterator<Set<Set<String>>> itr1 = alluniversity1.iterator();
		while (itr1.hasNext()) {
			Set<Set<String>> uni1 = itr1.next();
			System.out.println(uni1);
			Iterator<Set<String>> itr2 = uni1.iterator();
			while (itr2.hasNext()) {
				Set<String> uni2 = itr2.next();
				System.out.println(uni2);

				Iterator<String> itr3 = uni2.iterator();
				while (itr3.hasNext()) {
					String uni3 = itr3.next();
					System.out.println(uni3);
				}

			}

		}
		System.out.println("------------By ForEach loop----------------");
		for (Set<Set<String>> uni1 : alluniversity1) {
			System.out.println(uni1);

			for (Set<String> uni2 : uni1) {
				System.out.println(uni2);

				for (String uni3 : uni2) {
					System.out.println(uni3);
				}
			}
		}
	}

}
