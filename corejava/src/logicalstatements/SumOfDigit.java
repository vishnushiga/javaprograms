package logicalstatements;
import java.util.Scanner;
public class SumOfDigit {

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1st Number : ");
		 int num1 = sc.nextInt();
		 int sum =0;
		 for( ;num1>0;) {
			 int b = num1%10;
				
			 sum = sum+b;
			 num1=num1/10;
			 
		 }
		 System.out.println("the result : " + sum );
		 }
		 

	}


