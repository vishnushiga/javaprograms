package com.corejava;

//This program is of super() class constructor; 

public class Motorbike {
	String company;
	String model;
	int milege;
	double price;
	
	Motorbike() {
		this("ROYAL ENFIELD");
	}
    Motorbike(String company){
		this(company,"Gorilla 350");
	}
    Motorbike(String company,String model){
		this(company,model,35);
	}
    Motorbike(String company,String model,int milege){
		this(company,model,milege,350000);
	}
    Motorbike(String company,String model,int milege,double price){
		this.company=company;
		this.model=model;
		this.milege=milege;
		this.price=price;
	}
}
	 class  Gadi extends Motorbike{
		 Gadi(){
			super(); 
		 }
		 Gadi(String company,String model,int milege,double price){
			 super(company,model,milege,price);
		 }
	 
	 public static void main(String[] args) {
		 Gadi g = new Gadi();
		 g.display();
		 Gadi h = new Gadi("ROYAL ENFIELD","GT 650",30,550000);
		 h.display();
		
	 }
	 void display() {
		 System.out.println("Enter the comapany :" +company);
		 System.out.println("Enter the model :"+model);
		 System.out.println("How much milege it will gives : "+milege);
		 System.out.println("what's the price :"+price);
	 }
	 }
	 
