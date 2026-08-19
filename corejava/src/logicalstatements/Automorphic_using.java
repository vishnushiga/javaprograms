package logicalstatements;

import java.util.Scanner;

public class Automorphic_using {

	int automorphic(int n) {
		
		int count = 0;
		int target=n;
		while (n > 0) {

			n = n / 10;
			count++;
		}
		int mul=target*target;
		int r=0;
		int rev=0;
		for(int i=1;i<=count;i++) {
			r=mul%10;
			rev=rev*10+r;
			mul=mul/10;
		}
		int r1=0;
		int rev1=0;
		while(rev>0) {
			r1=rev%10;
			rev1=rev1*10+r1;
			rev=rev/10;
		}
		return rev1;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int m = automorphic(n);
		if(n==m) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not A Automorphic Number");
		}
	}

}
