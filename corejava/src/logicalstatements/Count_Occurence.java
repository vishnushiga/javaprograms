package logicalstatements;
import java.util.Scanner;
public class Count_Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();	
		}
		int count =0;
		System.out.println("Enter the target value : ");
		int target = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
