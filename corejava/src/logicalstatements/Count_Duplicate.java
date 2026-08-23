package logicalstatements;

public class Count_Duplicate {

	public static void main(String[] args) {
		int[] arr = {12, 5, 8, 20, 15, 12, 8, 5};
		for(int i=0;i<arr.length;i++) {
			boolean duplicate = false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate = true;
					break;
				}
			}
			if(duplicate) continue;
			int count = 0;
			for(int k=0;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
					count++;
				}
			}
			System.out.println("The duplicate count of "+arr[i]+" in array : "+count );
		}	

	}

}
