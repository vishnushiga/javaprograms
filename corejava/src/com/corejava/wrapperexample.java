package com.corejava;

public class wrapperexample {
	Integer a = 10;
	int b = Integer.valueOf(20);
	String c = "1234";

	public static void main(String[] args) {
		wrapperexample e = new wrapperexample();
		int h = Integer.parseInt(e.c);
		double g = Double.parseDouble(e.c);
		float j = Float.parseFloat(e.c);
		System.out.println(h);
		System.out.println(g);
		System.out.println(j);
		

	}

}
