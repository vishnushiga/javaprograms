package logicalstatements;
import java.util.Scanner;
public class Move_Zeroes {
	
	int slow = 0;


	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements into array : ");
		for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				 arr[slow] = arr[i];
				 slow++;
			}
		}
		while(slow<arr.length) {
			arr[slow] = 0;
			slow++;
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}

}
