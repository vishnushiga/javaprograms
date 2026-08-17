package logicalstatements;
import java.util.Arrays;
import java.util.Scanner;
public class Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the Array size :");
			int num = sc.nextInt();
			int[] a = new int[num];
			System.out.println("Enter " +num +" Numbers :");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
			System.out.println("The array elements are :"+Arrays.toString(a));
		
	}

}
