package com.corejava;
import java.util.Scanner;

//This program was this() constructor using Scanner;
public class product {
	String productName;
	double price;
	int quantity;
	
	product(){
	System.out.println("No Arg constructor called ");
	this("Iphone 17");
	}
	
	product(String productName){
		this(productName,75000);
	}
	
	product(String productName, double price){
		this(productName,price,10);
	}
	
	product(String productName,double price,int quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the product :");
		String productName = sc.nextLine();
		//sc.nextLine();
		System.out.println("Price of the product : ");
		double price = sc.nextDouble();
		System.out.println("How many products are available :");
		int quantity = sc.nextInt();
		
		
		product a = new product();
		a.call();
		product s = new product(productName,price);
		s.call();
		

	}
	void call() {
		System.out.println("Name of the product : "+productName);
		System.out.println("Price of the product : "+price);
		System.out.println("Product Availability :"+quantity);
		double total_price = price*quantity;
		System.out.println("Total Bill of the Customer:"+total_price);
	}

}
