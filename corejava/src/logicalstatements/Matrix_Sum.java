package logicalstatements;
import java.util.Scanner;
public class Matrix_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		int leftdiagonal_sum = 0;
		int rightdiagonal_sum = 0;
		int n = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
				if(i==j) {
					leftdiagonal_sum += arr[i][j];
				}
				
				if(i + j ==arr.length-1) {
					rightdiagonal_sum +=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Sum of 3*3 matrix : "+sum);
		System.out.println("Sum of Leftdiagonal 3*3 matrix : "+leftdiagonal_sum);
		System.out.println("Sum of rightdiagonal 3*3 matrix : "+rightdiagonal_sum);
	}

}
