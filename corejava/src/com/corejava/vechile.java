package com.corejava;

// This program is of super() class constructor;
public class vechile {
	String company;
	String model;
	double price;
	
	
	vechile(){
		this("TATA");
		System.out.println("No Arg-Password");
//		this("TATA");
	}
	
	vechile(String company){
		this(company,"Fortuner BASAVA");
	}
	
	vechile(String company,String model){
		this(company,model,4500000);
	}
	
	vechile(String company,String model,double price){
		this.company=company;
		this.model=model;
		this.price=price;
		
		System.out.println("Name of the Company :"+company);
		System.out.println("Company Model of the vechile : "+model);
		System.out.println("Ex Showroom price : "+price);
	}
}
	 class car extends vechile{
		 car(){
			 super();
		 }
		 car(String company,String model,double price){
		super(company,model,price);	
		}

//		super("TATA","OG INNOVA CRYSTA");
//		void main(String[] args) {
		 public static void main(String[] args) {
				car v = new car("TATA","OG INNOVA CRYSTA",350000);
				car v1 = new car();
			
			}	
		}
	

