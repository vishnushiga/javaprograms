package logicalstatements;
import java.util.Scanner;
public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits : ");
		int num = sc.nextInt();
		System.out.println("How many digits are you entering : ");
		int num1 = sc.nextInt();
		int digits = 0;
		int reverse = 0;
		for(int i=0;i<num1;i++) {
			digits = num%10;
			reverse = reverse*10 +digits;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
