package com.corejava;
import java.util.Scanner;

public class LoanIntrest {
	double CalculateIntrest(double principle,double rate,int time) {
		
		double simpleintrest = ((principle*rate*time)/100);
		System.out.println("Total Bank Loan Intrest :" +simpleintrest);
		return simpleintrest;
	}

	 void main() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter principle amount :" );
		 double principle =sc.nextDouble();
		
		 System.out.println("Enter Intrest rate :");
		 double rate = sc.nextDouble();
		 
		 System.out.println("Enter time :");
		 int time = sc.nextInt();
		  CalculateIntrest(principle,rate,time);

		 
	}

}
