package logicalstatements;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String s = "";
//		do {
			System.out.println("1 . Carrot");
			System.out.println("2 . betroot");
			System.out.println("3 . Potato");
			System.out.println("4 . cauliflower");
			System.out.println("5 . ladies finger");

			System.out.println("Enter which vegetable you want :");
			String veg = sc.nextLine();
			switch (veg) {
			case "1":
				System.out.println("Carrot");
				int p = 45;
				System.out.println("Price of the Carrot :" + p);
				break;
			case "2":
				System.out.println("betroot");
				int a = 50;
				System.out.println("Price of Betroot :" + a);
				break;
			case "3":
				System.out.println("potato");
				int b = 30;
				System.out.println("Price of the Potato :" + b);
				break;
			case "4":
				System.out.println("cauliflower");
				int c = 40;
				System.out.println("Price of the Cauliflower :" + c);
				break;
			case "5":
				System.out.println("ladies finger");
				int d = 25;
				System.out.println("Price of the ladies Finger :" + d);
				break;
			}
			System.out.println("z . Apple");
			System.out.println("x . Bananna");
			System.out.println("i . Orange");
			System.out.println("w . Avacado");
			System.out.println("Enter the Fruit Name :");
			String fruit = sc.next();
			switch (fruit) {
			case "z":
				System.out.println("Apple");
				int q = 100;
				System.out.println("Price of the Apple :" + q);
				break;
			case "x":
				System.out.println("Bananna");
				int e = 70;
				System.out.println("Price of the Bananna :" + e);
				break;
			case "i":
				System.out.println("Orange");
				int o = 85;
				System.out.println("Price of the Orange :" + o);
				break;
			case "w":
				System.out.println("Avacado");
				int t = 150;
				System.out.println("Price of the Avacado :" + t);
				break;
			}
//			System.out.println("Do you want to Continue : ");
//			s = sc.next();
//		} while (s.equalsIgnoreCase("Y"));

	}

}
