package com.corejava;
import java.util.Scanner;

public class Hospital {
	String patientname;
	int age;
	double chargeperday;
	int admitted;
	
void show(String patname,int age,double chargeperday,int admitted) {
		System.out.println("patient Name : "+ patname);
		System.out.println("patient Age : " + age);
		System.out.println("patient Charge per Day : " + chargeperday);
		System.out.println("patient Days of Admitted : " + admitted);
	}
	Hospital(){
		
	}

	 public Hospital(String patientname, int age, double chargeperday, int admitted) {
	this.patientname = patientname;
	this.age = age;
	this.chargeperday = chargeperday;
	this.admitted = admitted;
}


	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient name : ");
		String patientname = sc.nextLine();
		
		System.out.println("Enter Patient Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Charge per Day : ");
		double chargeperday = sc.nextDouble();
		
		System.out.println("Enter No'of Days Admitted : ");
		int admitted = sc.nextInt();
		
		Hospital h = new Hospital(patientname,age,chargeperday,admitted);
		h.show(patientname,age,chargeperday,admitted);
		h.bill();

	}
	
	void bill() {
		double total_bill = chargeperday * admitted;
		System.out.println("Total bill of the Hospital : " + total_bill);
	}

}
