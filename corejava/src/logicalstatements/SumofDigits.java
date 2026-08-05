package logicalstatements;
import java.util.Scanner;
public class SumofDigits {
	
	void digits(int a,int b) {
		int sum = 0;
		for(int i=a;i<=b;i++) {
			 sum += i;
		}
		System.out.println(sum);
	}

	  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		digits(a,b);

	}

}
