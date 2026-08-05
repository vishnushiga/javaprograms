package logicalstatements;
import java.util.Scanner;
public class ForLoopp {
	void Loop(String q) {
		for(char i='Z';i>='A';i--) {
			System.out.println(i);
		}
	}

	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Char : " );
		 String a = sc.next();
		 Loop(a);

	}

}
