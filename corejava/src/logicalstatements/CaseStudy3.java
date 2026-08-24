package logicalstatements;
import java.util.Scanner;
public class CaseStudy3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Temperatures of  patients : ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count =0;
		int sum = 0;
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			System.out.println("Temperature of patients "+i+ ":"+arr[i]+" ");

			
			if(arr[i]>max) {
				max = arr[i]; 
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>=100.4) {
				count++;
			}
			sum +=arr[i];
			 avg = sum/size;
			
		}
		System.out.println("Highest temperature of Patient : "+max);
		System.out.println("Lowest temperature of Patient : "+min);
		System.out.println("Patient having more than 100.4F temperature : "+count);
		System.out.println("Average temperature of Patients : "+avg);

	}

}
