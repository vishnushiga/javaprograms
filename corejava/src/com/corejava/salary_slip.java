package com.corejava;
import java.util.Scanner;

public class salary_slip {
	void salary_slip(String employeeName, double basicSalary) {
		double Hra = (basicSalary * 20)/100;
		double Da = (basicSalary * 10)/100;
		double gross_Salary = basicSalary + Hra + Da;
		System.out.println(Hra);
		System.out.println(Da);
		System.out.println(gross_Salary);
		
	}

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmployeeName: ");
		String employeeName = sc.next();
		
		System.out.println("Enter basicSalry: ");
		double basicSalry = sc.nextDouble();
		
		salary_slip(employeeName,basicSalry);
		System.out.println("main method ended");

	}

}
