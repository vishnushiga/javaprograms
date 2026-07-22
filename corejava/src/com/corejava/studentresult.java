package com.corejava;
import java.util.Scanner;

public class studentresult {
	
	void displaystudent(String name) {
		System.out.println("Name of the Student: "+ name);
	}
	void total(int m1,int m2,int m3) {
		int a= m1+m2+m3;
		System.out.println("Total marks of Students: "+ a);
	}
	
    void avg(int m1,int m2,int m3) {
    	double b = (m1+m2+m3)/3;
    	System.out.println("Avg of students: "+ b);
	}
	

 void main(String[] args) {
	 System.out.println("Main method started");
	 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter name of the Student: ");
	 String c = sc.nextLine();
		
	 displaystudent(c);
	 
	 
	 int marks1 = sc.nextInt();
	 int marks2 = sc.nextInt();
	 int marks3 = sc.nextInt();
	 total(marks1, marks2, marks3);
	 
	 avg(marks1,marks2,marks3);
	 

	 System.out.println("Main method ended");

	}

}
