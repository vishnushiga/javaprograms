package logicalstatements;
import java.util.Scanner;
public class CaseStudy2 {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Balance = 10000;
		double totalDeposited = 0;
		double totalWithdrawn = 0;
		for(int i=1;i<=5;i++) {
			System.out.println("Transaction " + i + " :");
			System.out.println("1 . Deposit");
			System.out.println("2 . Withdrawn");
			System.out.println("What you want : ");
			int trans = sc.nextInt();
			if(trans == 1) {
				System.out.println("Enter Deposit Amount : ");
				int depo = sc.nextInt();
				Balance += depo;
				totalDeposited += depo;
				System.out.println("Deposited : "+ depo);
			}else if(trans == 2) {
				System.out.println("Enter Withdrawn Amount : ");
				int draw = sc.nextInt();
				if(draw <= Balance) {
				Balance -= draw;
				totalWithdrawn += draw;
				System.out.println("Withdrawn : "+draw);
				}else {
					System.out.println("Insufficient Balance!");
				}
				
			}else {
				System.out.println("Invalid Choice!!");
		}
			System.out.println("Current Balance : "+ Balance);
			System.out.println("*********************************");
		}
		System.out.println("Final Balance : "+ Balance);
		System.out.println("Total Deposited : "+ totalDeposited);
		 System.out.println("Total Withdrawn : "+ totalWithdrawn);
	}
	 
	 }


