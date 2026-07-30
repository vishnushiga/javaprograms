package com.corejava;
import java.util.Scanner;
public class Electric_bill {

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Units Consumed :");
		 int b = sc.nextInt();
		 if(b<0) {
			 System.out.println("Invalid Inputs");}
		else if(b<=100) {
			int c = b*5;
			System.out.println("Electricity Bill :"+c);
		 }
		 else if(b<=200) {
			 int c = b*7;
			 System.out.println("Electricity Bill :"+c);
		 }
		 else if(b<=300) {
			 int c = b*10;
			 System.out.println("Electricity Bill :"+c);
		 }
		 else if(b<0) {
			 System.out.println("Invalid Inputs");
		 }
		 else {
			 System.out.println("ehh dengey");
		 }
		 

	}

}
