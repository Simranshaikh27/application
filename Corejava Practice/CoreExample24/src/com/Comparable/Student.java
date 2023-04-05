package com.Comparable;

public class Student implements Comparable<Student> {
	
	int sid;
	String sname;
	String address;
	public Student(int sid, String sname, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.sid>o.sid) {
			return 1;
		}else if(this.sid<o.sid) {
			return 0;
		}else {
			return -1;
		}
		
		
		
		
		
	}
	
	
	

}
