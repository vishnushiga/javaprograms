package com.corejava;

public class Studenttt {
	int id;
	String name;
	String course;
	
	Studenttt(){
		this(5);
	}
	
	Studenttt(int id){
		this(id,"vicky");
		
	}
	Studenttt(int id, String name){
		this(id,name,"java");
		
	}
	Studenttt(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	

	 void main(String[] args) {
		 Studenttt n = new Studenttt(1);
		 n.method();
		 Studenttt b = new Studenttt(2,"Mahendra",course);
		 b.method();
		 Studenttt m = new Studenttt(3,"bhanu",course);
		 m.method();
		
 
	}
	 void method(){
		 System.out.println("Student ID: "+id);
		 System.out.println("Student Name :" + name);
		 System.out.println("Student course :" + course);
	 }
	
	

}
