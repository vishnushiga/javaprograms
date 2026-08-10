package logicalstatements;
import java.util.Scanner;
public class Smallestnumberr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int a = 0;
		int min = num;
		for(;num>0;) {
			a = num%10;
			if(a<min) {
				min = a;
			}
			num = num/10;
		}
		System.out.println(min);
	}
}

