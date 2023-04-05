package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {

	//we can sort more than one 
		// return for if 1,for else if -1 and for else 0

	public static void main(String[] args) {
		
		Employee e= new Employee(2, "simran", 30000);
		Employee e1= new Employee(1, "sajjad", 40000);
		Employee e2 = new Employee(4, "gaurav",70000);
		Employee e3 = new Employee(3, "ajay", 50000);
		
		List<Employee> listofemployee = new ArrayList<>();
		listofemployee .add(e);
		listofemployee .add(e1);
		listofemployee .add(e2);
		listofemployee .add(e3);
		
		System.out.println("--------------------Before Sorting-------------");
		
		for(Employee employee:listofemployee ) {
			System.out.println(employee.id+"  "+employee.name+"  "+employee.salary);
		}
		
		System.out.println("---------Sorting by id---------------");
		
		Collections.sort(listofemployee,new SortbyEmpid());
		for(Employee employee:listofemployee) {
			System.out.println(employee.id+" "+employee.name+"  "+employee.salary);
		}
		
		
		System.out.println("----------------Sort by name-------------");
		Collections.sort(listofemployee,new SortbyEmpname());
		for(Employee employee:listofemployee) {
			System.out.println(employee.id+" "+employee.name+"  "+employee.salary);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
