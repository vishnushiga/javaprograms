package logicalstatements;
import java.util.Scanner;
public class NUmLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Print numbers from 1 to 100.
		
		System.out.println("Main method Started");
		for(int i = 0;i<=100;i++) {
			System.out.print(i);
		}
		System.out.println("Main methos Ended");
		
//	Print only even numbers between 1 and 50.

		for(int j=0;j<50;j=j+2) {
//			if(j%2==0) {
//				System.out.print(j);
//			}
		}
		
//		Print the multiplication table of any number entered by the user.
		
		System.out.println("Enter a number for Multiplication : ");
		int d = sc.nextInt();
		for(int i=0;i<=10;i++) {
			int sum = d*i;
			System.out.println(d +"*"+ i +"="+sum);
		}
		
//		Find the sum of numbers from 1 to N.
		System.out.println("Enter the N number for sum of number : ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=N;i++) {
			 sum += i;
		}
		System.out.println(sum);
		
//		Find the factors of a number.
		System.out.println("Enter a number for Factors : ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) { 
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}

		
	}

}
