package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
	//we can sort one at each time 
	// return for if 1,for else if 0 and for else 1

	public static void main(String[] args) {
		
		Student s= new Student(3, "SIMRAN", "PUNE");
		Student s1= new Student(4,"SAJJAD","SOLAPUR");
		Student s2 = new Student(7, "GAURAV","DELHI");
		
		List<Student>listofstudent=new ArrayList<>();
		listofstudent.add(s);
		listofstudent.add(s1);
		listofstudent.add(s2);
		
		System.out.println("-------------Before Sorting-----------");
		
		for(Student student:listofstudent) {
			System.out.println(student.sid+"  "+student.sname+" "+student.address);
		}
		
		System.out.println("------------Sort by id-------------");
		
		Collections.sort(listofstudent);
		for(Student student:listofstudent) {
			System.out.println(student.sid+"  "+student.sname+" "+student.address);
		
	}
	}
}