package com.corejava;
import java.util.Scanner;

public class Ternaryoper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Enter an operator :");
		char d = sc.next().charAt(0);
		int c = (d == '+') ? a + b : a - b;
		System.out.println(c);
		

	}

}
