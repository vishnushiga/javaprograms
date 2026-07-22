package com.corejava;

import java.util.Scanner;

public class Bank {
	int accountnumber;
	String ifsccode;
	String addressname;
	double balance;
	String bankName;
//	Bank(){
		
	
	

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		enterDetails(sc);
		
		

	}
	void enterDetails(Scanner sc) {
		System.out.println("Enter account number: ");
		int accountnumber = sc.nextInt();
		System.out.println("Enter Ifsc code: ");
		sc.nextLine();
		String ifsccode = sc.nextLine();

		System.out.println("Enter Address Name: ");
		String addressname = sc.nextLine();
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		System.out.println("Enter Bank Name : ");
		sc.nextLine();
		String bankName = sc.nextLine();
		
		
		show( accountnumber, ifsccode, addressname, balance, bankName);

	}
	void show(int accountnumber,String ifsccode,String addressname,double balance,String bankName) {
		System.out.println("Account number : "+accountnumber);
		System.out.println("IFSC CODE : "+ifsccode);
		System.out.println("Address Name : "+addressname);
		System.out.println("Balance :  "+balance);
		System.out.println(" Bank Name : "+ bankName);
		
	}

}

