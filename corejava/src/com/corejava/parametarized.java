package com.corejava;

public class parametarized {
	int eid;
	String ename;
	double esal;
	
	public parametarized() {
		System.out.println("no arg constructor called ");
		eid = 100;
		ename = "unknown";
		esal = 10000.00;
	}
	
	parametarized(int eid, String ename, double esal){
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
//	To avoid data conflicts, we need to maintain exact variables in parameters
//	And if we have same parameter name we must need to use " this " keyword
//	to pass the values to current object data, which will help to provide better readability
	
	
//If we want to assign like this we can do or Otherwise we can do this->
//		parametarized(int i, String n, double s){
//			System.out.println("Parameter constructor called ");
//		eid = i;
//		ename = n;
//		esal = s;
//	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		parametarized e1 = new parametarized();
		e1.empInfo();
		
		parametarized e2 = new parametarized(101,"Anki Reddy",50000.0);
		e2.empInfo();
		
		System.out.println("main method ended");
	}
	
	void empInfo() {
		System.out.println("Employee ID : " +eid);
		System.out.println("Employee Name : " +ename);
		System.out.println("Employee Salary : " +esal);
		System.out.println("*******************************");
	}

}
