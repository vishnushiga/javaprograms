package com.corejava;

public class TypesOfMethod1 {
//------------NO RETURN TYPE + NO ARGUMENTS------------
	 public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTED");
		
		TypesOfMethod1 t = new TypesOfMethod1();
		t.showplandetails();
	    System.out.println("MAIN METHOD ENDED");
	    
	}
	 void showplandetails() {
		 int plan = 299;
		 int valid = 28;
		 String datd = "1.5 GB/Day";
		 String call = "Unlimited";
		 System.out.println("Plan Name:"+"Unlimited " +plan);
		 System.out.println("Validity: " + valid+ " Days");
		 System.out.println("Data: "+ datd);
		 System.out.println("Calls: "+call);
	 }

}
