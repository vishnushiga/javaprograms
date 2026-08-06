package logicalstatements;
import java.util.Scanner;
public class ForLooping {

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int a = sc.nextInt();
		 loop(a);
		 
		 for(int i=1;i<=100;i++) {
			 if(i%3==0 && i%5==0) {
				 System.out.print(i+" ");
			 }
		 }
		 
	  
	}
	 void loop(int n) {
	
		 int sum = 1;
		 for(int i=1;i<=10;i++) {
			 sum = n*i;
			 System.out.print(sum);
		 }
	 }

}
