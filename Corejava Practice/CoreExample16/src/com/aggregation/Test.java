package com.aggregation;

public class Test {
	
	public static void main(String[] args) {
	
		Address address = new Address("PCMC", "PMC", "411044");
		
		Student s = new Student(10,"Simran",address);
		Student s1 = new Student(11,"Gaurav",address);
		
		Address address1 = new Address("Solapur","BMC","411012");
		
		Student s2= new Student(12,"Sajjad",address1);
		Student s3 = new Student(13,"Ajay",address1);
		
		System.out.println(s.id+" "+s.name+" "+s.address.localAdr+" "+s.address.perAdr+" "+s.address.pinCode);
		System.out.println(s1.id+" "+s1.name+" "+s1.address.localAdr+" "+s1.address.perAdr+" "+s1.address.pinCode);
		System.out.println(s2.id+" "+s2.name+" "+s2.address.localAdr+" "+s2.address.perAdr+" "+s2.address.pinCode);
		System.out.println(s3.id+" "+s3.name+" "+s3.address.localAdr+" "+s3.address.perAdr+" "+s3.address.pinCode);
		
		// DECLARED REFRENCE ENTITY CLASS IS MUST 
		
	}

}
