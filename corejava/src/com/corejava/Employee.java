package com.corejava;

public class Employee {
	static String companyname;
	static String location;
	
	 static String employeename;
	int salary;

	public static void main(String[] args) {
		Employee e = new Employee();
		
	}	
    static {
			System.out.println("Company Name : "+ (companyname = "wipro"));
			System.out.println("Company Location :"+ (location = "Hyderabad"));
		}

	
	

	{
//		Employee e = new Employee();
		employeename = "vicky";
		salary = 99999;
		System.out.println("Employee Name : " + employeename);
		System.out.println("Employee Salary : "+ salary);
	}

}
