package com.corejava;
import java.util.Scanner;

public class Hotelbooking {
	String name;
	int rooms;
	int days;
	double roomcharge;
	
	Hotelbooking(){
		this("coupling ka dhad dhad");
	}
	Hotelbooking(String name){
		this(name,5);
	}
	Hotelbooking(String name,int rooms){
		this(name,rooms,10);
	}
	Hotelbooking(String name,int rooms,int days){
		this(name,rooms,days,1500);
	}
	Hotelbooking(String name,int rooms,int days,double roomcharge){
		this.name=name;
		this.rooms=rooms;
		this.days=days;
		this.roomcharge=roomcharge;
	}

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What's the Hotel Name :");
		 String a = sc.nextLine();
		 System.out.println("How many Rooms are Available :");
		 int s = sc.nextInt();
		 System.out.println("How many days you want to stay :");
		 int d = sc.nextInt();
		 System.out.println("How much they charge per Room :");
		 double f = sc.nextDouble();
		 
	
		 
		Hotelbooking v = new Hotelbooking(a);
		v.show();
		Hotelbooking b = new Hotelbooking(a,s);
		b.show();
		Hotelbooking n = new Hotelbooking(a,s,d);
		n.show();
		Hotelbooking m = new Hotelbooking(a,s,d,f);
		m.show();

	}
	void show() {
		double Total_Bill = rooms * days * roomcharge;
		System.out.println("Enter the Hotel Name : "+name);
		System.out.println("How many are Rooms Available : "+rooms);
		System.out.println("How many you want to stay : "+days);
		System.out.println("Room Charge per day : "+roomcharge);
	
		System.out.println("Total_Bill of the Hotel :"+Total_Bill);
		System.out.println("                                  ");
	}

}
