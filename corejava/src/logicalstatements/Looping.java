package logicalstatements;
import java.util.Scanner;
public class Looping {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
//		System.out.println(Mul(num));
		Mul(num);
	}
	 int Mul(int n) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += n*i;
		
		}
		System.out.println(sum);
		return sum;
		
	}

}
