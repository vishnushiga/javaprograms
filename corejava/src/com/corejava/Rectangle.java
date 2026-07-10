package com.corejava;

public class Rectangle {
	Integer proid;
	String proname;
	Float price;
	Integer rating;
	boolean proavailable;
	Integer quan;
	Integer disper;
	Integer procode;

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.proid = 1;
		r.proname = "ipad";
		r.price = 454545f;
		r.rating = 5;
		r.proavailable = true;
		r.quan = 10;
		r.disper = 20;
		r.procode = 565656;
		System.out.println("Product ID :"+r.proid );
		System.out.println("Product name :"+r.proname );
		System.out.println("Product price :"+r.price );
		System.out.println("Product rating :"+r.rating );
		System.out.println("Product available :"+r.proavailable );
		System.out.println("Product stock :"+r.quan );
		System.out.println("Product discount :"+r.disper +"%" );
		System.out.println("Product code :"+r.procode );

	}

}
