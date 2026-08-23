package logicalstatements;
//   Running Sum

//Problem: Return an array where each element at index i is the sum of all elements
//from index 0 to i.
import java.util.Arrays;

public class Running_Sum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.println((sum));
		}
	}
}
