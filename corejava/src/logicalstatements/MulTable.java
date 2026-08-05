package logicalstatements;
import java.util.Scanner;
public class MulTable{
	void loop(int n) {
		for(int i=1;i<=10;i++) {
			int sum = n*i; 
			System.out.println(n +" * "+ i +"="+ sum);
		}
	}

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		loop(a);
		

	}

}
