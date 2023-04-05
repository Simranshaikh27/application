package com.hierarchyinheritance;

public class Developer extends Employee {
	
	int bonusSalary=50000;
	
	
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.m1();
		int totalsalary=(dev.baseSalary+dev.bonusSalary);
		System.out.println("Total salary :"+totalsalary);
	
		ProjectManager pm= new ProjectManager();
		int totalsalary1=(pm.baseSalary+pm.bonusSalary);
		System.out.println("Total salary:"+totalsalary1);
	
	
	
	
	
	
	
	}
	
	
		
	

}
