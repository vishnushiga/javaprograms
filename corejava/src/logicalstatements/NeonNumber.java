package logicalstatements;
import java.util.Scanner;
public class NeonNumber {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		neon(a);
		
	}
	void neon(int a) {
		int sqar= a*a;
		int sum = 0;
		while(sqar != 0) {
			int digit = sqar % 10;
			sum += digit;
			sqar = sqar /10;
		}
		if(sum == a) {
			System.out.println(a+ " Neon Number ");
		}else {
			System.out.println(a+" Not Neon Number");
		}
	}

}
