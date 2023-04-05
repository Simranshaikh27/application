package com.returntype;

public class Demo {

	public void m1() {
		
		System.out.println("m1 method of demo class");
	}

      public int  m2() {
    	  System.out.println("m2 method ");
    	  
    	 return 20;
      }
 
      public String m3() {
    	  
    	  return "simran";
      }
 
      public double m4() {
    	  
    	  return 100.123;
      }

     public float m5() {
    	 
    	 return 100.1f;
     }

 
     public char m6() {
    	 
    	 return 'a';
     }
 
     public boolean m7() {
    	 
    	 return true;
     }

     public Student addStudentDetails() {
  	   Student student = new Student();
  	   student.id=10;
  	   student.name="simran";
  	   
     return student;
  	   
     }
     
     
public static void main(String[] args) {
	 Demo d = new Demo();
	 d.m1();
	
	 System.out.println("----------------------------------");
	 System.out.println("type1 for calling return type");
	 
	 d.m2();
	 
	 System.out.println("type 2 for calling return type");
	int i =d.m2();
	System.out.println(i);
	
	System.out.println("type 3 for calling return type");
	System.out.println(d.m2());
	
	System.out.println("----------------------------------------");
	String s  = d.m3();
	System.out.println(s);
	
	     double d1  = d.m4();
	 System.out.println(d);
	 
	     float f  = d.m5();
	     System.out.println(f);
	     
	    char c  =d.m6();
	    System.out.println(c);
	    
	         boolean b   = d.m7();
	         System.out.println(b);
	         
	 System.out.println("---------------------------");
	       
	       Student s1= d.addStudentDetails();
	        System.out.println(s1.id);
	        System.out.println(s1.name);
	        
	     
	
}
     
    	   
       }












