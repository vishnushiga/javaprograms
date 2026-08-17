package logicalstatements;
import java.util.Scanner;
public class SumandAvg_usingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the "+ num +" Numbers :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Sum of Array :");
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of "+num+ " values :" +sum);
		
		double avg = sum/num;
		System.out.println("Avg of " +num+ " values :"+ avg);
	}

}
