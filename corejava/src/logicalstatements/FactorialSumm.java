package logicalstatements;
import java.util.Scanner;
public class FactorialSumm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial : ");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=num ; i>=1; i--) {
			int fact = 1;
			for(int j=i;j>=1;j--) {
			  fact = fact*j;
			}
			sum += fact;
		}
		System.out.println(sum);
	}
}