package logicalstatements;
import java.util.Scanner;
public class EvenandOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Number :");
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				System.out.println("Even Number");
			}else {
				System.out.println("Odd Number");
			}
		}
	}

}
