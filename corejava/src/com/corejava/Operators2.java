package com.corejava;

public class Operators2 {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int f = 6;
	int g = 1;   

	 void main(String[] args) {
		System.out.println("*****Assignment Operator*****");
		System.out.println("Add and Assign to value a :"+(a+=10));
		System.out.println("Subtract and Assign to value b :"+(b-=2));
		System.out.println("Multiply and Assign to value c :"+(c*=10));
		System.out.println("Division and Assign to value d :"+(d/=2));
		System.out.println("Modulus and Assign to value e :"+(e%=6));
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("*****Relational Operator*****");
		System.out.println("Equal to --> a==g"+(a==g));
		System.out.println("Not Equal to --> a!=b:"+(a!=b));
		System.out.println("Greater than --> "+(a>b));
		System.out.println("Less than --> "+(b<a));
		System.out.println("Greater than or Equal to --> "+(a>=b));
		System.out.println("Lesser than or Equal to --> "+(a<=b));

	}

}
