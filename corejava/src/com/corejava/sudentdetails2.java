package com.corejava;
import java.util.Scanner;

public class sudentdetails2 {
	int z(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
	int x(int c,int d) {
		int e = c + d;
		System.out.println(e);
		return e;
	}
	int v(int e, int f) {
		int g = e + f;
		System.out.println(g);
		return g;
	}
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values :" );
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = z(a,b);
		System.out.println("Enter the third value :");
		int d = sc.nextInt();
		int e = x(c,d);
		System.out.println("Enter the third number :");
		int f = sc.nextInt();
		int g = v(e,f);
		
	}

}
