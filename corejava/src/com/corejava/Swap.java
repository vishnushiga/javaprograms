package com.corejava;

public class Swap {
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	int temp;

	

	 void main(String[] args) {
		 temp = a;
		 a=b;
		 b=temp;
	 System.out.println("Enter the value of a:"+a);
	 System.out.println("Enter the value of b:"+b);
		 
		 c = c+d;
		 d = c-d;
		 c = c-d;
	 System.out.println(c);
	 System.out.println(d);

	}

}
