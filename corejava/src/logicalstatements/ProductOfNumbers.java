package logicalstatements;
import java.util.Scanner;
public class ProductOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int val = sc.nextInt();
		int pro = 1;
		for(;val>0;) {
			int summ1 = val%10;
			 pro *= summ1;
			 val= val/10;
			 
		}
		System.out.println("The result : "+pro);

	}

}
