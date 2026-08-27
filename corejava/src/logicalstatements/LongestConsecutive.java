package logicalstatements;

public class LongestConsecutive {

	public static void main(String[] args) {
		int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		int maxLength = 0;
		
		for(int i=0;i<arr.length;i++) {
			int current = arr[i];
			int count = 1;
			for(int j=0;j<arr.length;j++) {      
				if(arr[j] == current+1) {
					current = arr[j];
					count++;
					j = -1;
				}
			}
			if(count>maxLength) {
				maxLength=count;
			}
		}
		System.out.println(maxLength);
	}
}