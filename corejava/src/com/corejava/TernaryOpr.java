package com.corejava;

public class TernaryOpr {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int status = (a>=b)? ((a>=c)?a:c):((b>=c)?b:c);
		System.out.println(status);
	}
}
