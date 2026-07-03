package com.corejava;

public class Studen {
	static String sclname = "Srujana";
	String n ;
	int r;
	double m;
	

	public static void main(String[] args) {
		Studen s1 = new Studen();
		s1.n = "Vijay";
		s1.r = 1;
		s1.m = 10;
		System.out.println("School Name : " + sclname);
		System.out.println("Student Name : " + s1.n);
		System.out.println("Student Roll : " + s1.r);
		System.out.println("Student Marks : " + s1.m);
		
		
		Studen s2 = new Studen();
		s2.n = "Varun";
		s2.r = 2;
		s2.m = 20;
		System.out.println("Student Name : " + s2.n);
		System.out.println("Student Roll : " + s2.r);
		System.out.println("Student Marks : " + s2.m);
		
		
		Studen s3 = new Studen();
			s3.n = "Vishnu";
			s3.r = 3;
			s3.m = 30;
		System.out.println("Student Name : " + s3.n);
		System.out.println("Student Roll : " + s3.r);
		System.out.println("Student Marks : " + s3.m);
		
		
		

	
		}
}
