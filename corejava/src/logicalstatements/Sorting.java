package logicalstatements;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,1,4,7,5};
		Arrays.sort(arr);
		System.out.println("Sorting array : "+ Arrays.toString(arr));
	}

}
