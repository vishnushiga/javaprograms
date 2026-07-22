package com.corejava;
import java.util.Scanner;

public class Salary_Calculator {
	void displayprofile(String empName, String designation) {
		System.out.println("Employee name : "+ empName);
		System.out.println("Employee Designation :"+ designation);
	}
	
	double calculateGrossSalary(double basicSalary, double allowances) {
		double grssl= basicSalary + allowances;
		System.out.println("Employee Gross Salary : "+ grssl);
		return grssl;
	}
	
	void calculateNetSalary(double basicSalary, double deductions) {
		double netsl = basicSalary - deductions;
		System.out.println("Employee net salary : "+netsl);
	}

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Empname : ");
		 String empName = sc.next();
		 System.out.println("Enter emp designation : ");
		 String designation = sc.next();
		 displayprofile(empName,designation);
		 
		 System.out.println("Enter emp basic salary :");
		 double basicSalary = sc.nextDouble();
		 System.out.println("Enter emp allowances :");
		 double allowances = sc.nextDouble();
		 calculateGrossSalary(basicSalary,allowances);
		 
		 System.out.println("Enter emp basic salary : ");
		 double basicSalry = sc.nextDouble();
		 System.out.println("enter emp deduction : ");
		 double deductions = sc.nextDouble();
		 calculateNetSalary(basicSalary,deductions);
		 
	

	}

}
