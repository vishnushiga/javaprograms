package logicalstatements;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					while (start <= end) {
						temp = arr[i][start];
						arr[i][start] = arr[i][end];
						arr[i][end] = temp;
						start++;
						end--;
					}
				} else if (i % 2 != 0 && i != j) {
					arr[i][j] *= 2;
				}
				if (i == j) {
					arr[i][j] *= arr[i][j];
				}
			}

		}

		System.out.println(Arrays.deepToString(arr));

	}
}
