package com.corejava;
import java.util.Scanner;
public class Discount {

	 void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount :");
		int a = sc.nextInt();
		if(a>=1000 && a<=1999) {
			double b2 = a-(a*5/100);
			System.out.println("5% discount :"+b2);
		}
		else if(a>2000 && a<5000) {
			double b1 =a-(a*10/100);
			System.out.println("10% discount"+b1);
		}
		else if(a>5000) {
			double b3 = a-(a*20/100);
			System.out.println("20% discount"+b3);
		}
		else {
			System.out.println("NO Discount");
		}

	}

}
