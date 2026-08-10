package logicalstatements;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int a =0;
		int max = 0;
		for(;num>0;) {
			a = num%10;
			if(a>max) {
				max = a;
			}
		    num = num/10;
			

		}
		System.out.println(max);
	}
}
