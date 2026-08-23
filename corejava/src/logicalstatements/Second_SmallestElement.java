package logicalstatements;

public class Second_SmallestElement {

	public static void main(String[] args) {
		int[] arr = {4,3,1,2,5};
		int min = arr[0];
		int max = arr[0];
		int ans = 0;
		int secondmin = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin = arr[i];
				min =  secondmin;
				
			}
//			if(arr[i]>max) {
//				max = arr[i];
//			}
			if(arr[i]>min && arr[i]<max) {
				ans = arr[i];
			}
		}
		System.out.println(ans);
	}
}


