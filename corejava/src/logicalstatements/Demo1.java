package logicalstatements;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			System.out.println("Enter what you want vegitable or frutes");
			System.out.println("1.Vegitable");
			System.out.println("2.Frutes");
			System.out.println("Enter what you want :");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter vagitable");
				System.out.println("1 . Carrot");
				System.out.println("2 . betroot");
				System.out.println("3 . Potato");
				System.out.println("4 . cauliflower");
				System.out.println("5 . ladies finger");
				System.out.println("Enter which vegetable you want :");
				int n1 = sc.nextInt();
				switch (n1) {
				case 1: {
					System.out.println("Carrot");
					int p = 45;
					System.out.println("Price of the Carrot :" + p);
					break;

				}
				case 2: {
					System.out.println("betroot");
					int a = 50;
					System.out.println("Price of Betroot :" + a);
					break;

				}
				case 3: {
					System.out.println("potato");
					int b = 30;
					System.out.println("Price of the Potato :" + b);
					break;

				}
				case 4: {
					System.out.println("cauliflower");
					int c = 40;
					System.out.println("Price of the Cauliflower :" + c);
					break;

				}
				case 5: {
					System.out.println("ladies finger");
					int d = 25;
					System.out.println("Price of the ladies Finger :" + d);
					break;

				}
				default:
				}
				break;
			}
			
			case 2: {
				System.out.println("Enter Fruit");
				System.out.println("1 . Apple");
				System.out.println("2 . Bananna");
				System.out.println("3 . Orange");
				System.out.println("4 . Avacado");
				System.out.println("Enter the Fruit Name :");
//				String fruit = sc.next();
				//System.out.println("Enter which vegetable you want :");
				int n1 = sc.nextInt();
				switch (n1) {
				case 1: {
					System.out.println("Apple");
					int q = 100;
					System.out.println("Price of the Apple :" + q);
					break;

				}
				case 2: {
					System.out.println("Bananna");
					int e = 70;
					System.out.println("Price of the Bananna :" + e);
					break;

				}
				case 3: {
					System.out.println("Orange");
					int o = 85;
					System.out.println("Price of the Orange :" + o);
					break;

				}
				case 4: {
					System.out.println("Avacado");
					int t = 150;
					System.out.println("Price of the Avacado :" + t);
					break;

				}
				}

			}
			default:
			}
			System.out.println("want continue");
			s = sc.next();
		} while (s.equalsIgnoreCase("Y"));
	}
}
