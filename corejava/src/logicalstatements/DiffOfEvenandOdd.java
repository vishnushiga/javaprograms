package logicalstatements;

public class DiffOfEvenandOdd {

	public static void main(String[] args) {
		int[] arr = {12, 5, 8, 20, 15};
		int even = 0;
		int odd = 0;
		for(int num : arr) {
			if(num%2==0) {
				even += num;
			}else  {
				odd += num; 
			}
		}
		int difference = even - odd;
		System.out.println("The sum of Even Numbers : "+even);
		System.out.println("The sum of Odd Numbers : "+odd);
		System.out.println("The difference between sum of even and odd :"+difference);
	}

}
