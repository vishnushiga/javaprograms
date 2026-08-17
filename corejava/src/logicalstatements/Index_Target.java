package logicalstatements;
import java.util.Scanner;
public class Index_Target {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the values into array :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		System.out.println("Enter the target : ");
		int target = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			
			if(target == arr[i]) {
				System.out.println("index : "+i);
			}
		}
	}

}
