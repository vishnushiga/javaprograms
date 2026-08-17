package logicalstatements;
import java.util.Scanner;
public class MaxandMin_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min<arr[0]) {
				min = arr[0];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum number : "+min);
		System.out.println("Minimum number : "+max);
	}

}
