package logicalstatements;

public class ReverseArray {

	public static void main(String[] args) {
		 ReverseArray ra = new ReverseArray();
		 ra.swap_reverse();
		 System.out.println();
		int[] arr = {1,2,3,4,5,6};
		System.out.print("Original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reversed array : ");
		for(int j=arr.length-1;j>=0;j--) {
		    System.out.print(arr[j]+" ");
			}
	}
	void swap_reverse() {
		int[] arr1 = {1,2,3,4,5,6};
		int start = 0;
		int end = arr1.length-1;
		while(start<end) {
			int temp = arr1[start];
			arr1[start] = arr1[end];
			arr1[end] = temp;
			start++;
			end--;
		}
		System.out.print("Reverse array using swap : ");
		for(int num : arr1) {
			System.out.print(num+" ");
		}
	}

}
