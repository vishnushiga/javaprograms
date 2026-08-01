package com.corejava;
import java.util.Scanner;
public class Testnestedif_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's ur name :");
		String a = sc.nextLine();
		System.out.println("What is ur Salary :");
		Double sal = sc.nextDouble();
		if (sal>=5000000||sal<=7000000) {
			System.out.println("Good to go");
			System.out.println("Kamainchina aasthulu entha unnai : ");
		
			double assets=sc.nextDouble();
			if(assets>=100000000) {
				System.out.println("Ni amma G***a balsinollu ra babu");
			
			     System.out.println("mari sukka mukka emaina puchukuntava:");
			     boolean dawath = sc.nextBoolean();
			     if(dawath) {
			    	 System.out.println("eedu ni bamardhi kojja gadu deniki panikiradu");
			    	 System.out.println("Na bidda ni ee seema ni, ni chethilo pedthuna");
			    	 System.out.println("aaladinchu, RAJAREDDY Alludu osthunadu ante uucha poskovali");
			     }
			     else {
			    	 System.out.println("pora pilla bacha nayala");
			     }
			}else {
				System.out.println("Dengey ra saleyy");
			}
		
		}else {
			System.out.println("poi saduvko ra betayyy");
		}
	}

}
