package logicalstatements;
import java.util.Scanner;
public class Passport_Verification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String a = sc.nextLine();
		System.out.println("Enter ur Age :");
		int s = sc.nextInt();
		System.out.println("Enter your Citizenship :");
		sc.nextLine();
		String d = sc.next();
		System.out.println("Police Verification :");
		boolean f = sc.nextBoolean();
		if(d.equalsIgnoreCase("india")) {
			System.out.println("Ok Fine");
			if(s>=18) {
				System.out.println("You are eligible");
				if(f) {
					System.out.println("good to move further process");
				}else {
					System.out.println("not approved");
				}
			}else {
				System.out.println("pora bachkai");
			}
		}else {
			System.out.println("Get out of my motherland");
		}

	}

}
