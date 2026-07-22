package com.corejava;

public class TypesOfMethod2 {
//-----------NO RETURN TYPE + WITH ARGUMENTS-----------
	 void main(String[] args) {
		 System.out.println("Main method started");
		 plandetails();
		 plandetails("299");
		 System.out.println("Main method ended");

	}
	 void plandetails() {
		 System.out.println("Recharge Successful");
		 System.out.println("******Calling instance method without arguments******");
		 
	 }
	 void plandetails(String amt) {
		 System.out.println("Recharge Amount :"+amt);
	 }

}
