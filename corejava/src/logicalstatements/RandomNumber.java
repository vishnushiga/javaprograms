package logicalstatements;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int r = rand.nextInt(10)+1;
		int attempts = 3;
		
		System.out.println("Guess the Number : ");
		for(int i=1;i<=attempts;i++) {
			System.out.println("Attempt "+i+ " Enter your Guess :");
			int Guess_num = sc.nextInt();
			
			if(Guess_num == r) {
				System.out.println("The guess is correct");
				break;
			}else {
				System.out.println("You are Wrong");
				if(attempts<=3) {
					System.out.println("U r out of range");
				}
			}
			
		}
		System.out.println("The random number is : "+r);
	} 

}
