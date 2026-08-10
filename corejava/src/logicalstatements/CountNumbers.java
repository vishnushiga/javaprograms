package logicalstatements;
import java.util.Scanner;
public class CountNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int a = 0;
		int digit =0;
		for(int i=num;i!=0;i = i/10) {
			 a++;
		}
		System.out.println(a);

	}

}
