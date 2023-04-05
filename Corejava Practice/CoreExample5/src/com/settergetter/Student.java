package com.settergetter;

public class Student {

	private int id;
	
	private String name;
	
	private String address;
	
	private long mbno;
	
	private double fees;
	
	private String std;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setMbno(long mbno) {
		this.mbno=mbno;
	}
	
	public long getMbno() {
		return mbno;
	}
	
	public void setFees(double fees) {
		this.fees=fees;
	}
	public double getFees() {
		return fees;
	}
	
	public void setStd(String std) {
		this.std=std;
	
	}
    
	public String getStd() {
		return std;
	}

public static void main(String[] args) {
	Student s = new Student();
	s.setId(10);
	System.out.println(s.getId());
	s.setName("simran");
	System.out.println(s.getName());
	s.setAddress("pune");
	System.out.println(s.getAddress());
	s.setMbno(9881);
	System.out.println(s.getMbno());
	s.setFees(10000.12);
	System.out.println(s.getFees());
	s.setStd("10th");
	System.out.println(s.getStd());
	
}

}
