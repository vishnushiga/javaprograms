package com.corejava;

public class Reservation {
	String passengerName;
	int trainNo;
	String coach;
	int seat;
	double price;
	Reservation r;
	Reservation(String passengerName,int trainNo,String coach,int seat,double price){
		this.passengerName=passengerName;
		this.trainNo=trainNo;
		this.coach=coach;
		this.seat=seat;
		this.price=price;
		
	}
	Reservation(){
		this("Dhedhushar");
		System.out.println("no-arg constructor called");
	}
	Reservation(String passengerName){
		this(passengerName,3456,"AC ra Beteyyyy",0,0.0);
//		this.passengerName=passengerName;
	}
	Reservation(Reservation r,int trainNo,String coach){
		this(r.passengerName,trainNo,coach,r.seat,r.price);
//		this.passengerName=r.passengerName;
//		this.trainNo=trainNo;
//		this.coach=coach;
	}
	Reservation(Reservation r,int seat,double price){
		this(r.passengerName,r.trainNo,r.coach,seat,price);
	}
//	Reservation(Reservation r,int seat,double price){
//		this.passengerName=r.passengerName;
//		this.trainNo=r.trainNo;
//		this.coach=r.coach;
//		this.seat=seat;
//		this.price=price;
//		
//	}
	

	public static void main(String[] args) {
		Reservation r = new Reservation();
		r.show();
		Reservation t = new Reservation("Rajanna");
		t.show();
		Reservation y = new Reservation(t,22311,"General sleeper 7");
		y.show();
		Reservation u = new Reservation(y,44,550);
		u.show();

	}
	void show() {
		System.out.println("********************************************");
		System.out.println("what's the PassengerName : "+passengerName);
		System.out.println("Enter the train number : "+trainNo);
		System.out.println("Which Coach is obtained :"+coach);
		System.out.println("What are the seat numbers :"+seat);
		System.out.println("What's the ticket fair :"+price);
		System.out.println("*********************************************");
	}

}
