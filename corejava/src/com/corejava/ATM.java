package com.corejava;
import java.util.Scanner;

public class ATM {
	double deposit;
	double withdraw;
	//double checkbalance;
	
	ATM(){
		this(2000);
	}
	
	ATM(double deposit){
		this(deposit,1000);
	}
	
	ATM(double deposit, double withdraw){
		
		this.deposit=deposit;
		this.withdraw=withdraw;
	}
	
	/*ATM(double deposit,double withdraw){
		this.deposit=deposit;
		this.withdraw=withdraw;
		*/

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit Money :");
		double deposit = sc.nextDouble();
		System.out.println("Withdrawal Amount :");
		double withdraw = sc.nextDouble();
		//System.out.println("Entha unnai ani ra okatee chustunav :");
//		double checkbalance = sc.nextDouble();
		
	
		
		ATM z = new ATM();
		z.piluv_nannu();
		ATM x = new ATM(deposit,withdraw);
		x.piluv_nannu();
	

	}
	
	void piluv_nannu() {
		System.out.println("Aa randi randi ikkada kurchondi:" +deposit);
		System.out.println("Ee lan*****duku evaru, Ee lan*****duku evaru"+withdraw);
		double checkbalance = deposit-withdraw;
		System.out.println("Arey chethanakodaka diniki unna vishwasam undha ra niku:"+checkbalance);
		
	}

}
