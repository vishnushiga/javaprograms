package logicalstatements;
import java.util.Scanner;
public class NestedSwitch {
static String s = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Welcome To The Avenue Multi Cuisine Restarent");
		System.out.println("Pleasure to in Sir, We are providing ");
		System.out.println("1. Staters");
		System.out.println("2.Main Course");
		System.out.println("3.dessert");
		System.out.println("What you want to order Sir :");
		int a = sc.nextInt();
		switch(a) {
		case 1 :
			System.out.println("1 . Bheja Fry");
			System.out.println("2 . Paaya Soup");
			System.out.println("3 . Keema Kichidi");
			System.out.println("4 . chilli chicken");
			System.out.println("1 . Chicken Lollipop");
			System.out.println("Which Starter you picked up :");
			int b = sc.nextInt();
			switch(b) {
			case 1:{
				System.out.println("Here is your delicious Bheja Fry");
				System.out.println("Every bite you will Enjoy it ");
				break;}
			case 2:{
				System.out.println("Here is your delicious paaya Soup");
				System.out.println("Every bite you will Enjoy it ");
				break;}
			case 3:{
				System.out.println("Here is your delicious Keema Kichidi");
				System.out.println("Every bite you will Enjoy it ");
				break;}
			case 4 :{
				System.out.println("Here is your delicious Chilli Chicken");
				System.out.println("Every bite you will Enjoy it ");
				break;}
			case 5:{
				System.out.println("Here is your delicious Chicken Lollipop");
				System.out.println("Every bite you will Enjoy it ");
				break;}
			
			}
		case 2:
			System.out.println("********This is the Main Course*********");
			System.out.println("1 . Mutton Dum Biryani");
			System.out.println("2 . Chicken Dum Biryani");
			System.out.println("3 . Mutton Murg Biryani");
			System.out.println("4 . Chittimutyala Chicken Pulao");
			int c = sc.nextInt();
			switch(c) {
			case 1:{
				System.out.println("Here is your Mutton Dum Biryani");
				System.out.println("It feels Sukkonnn");
				break;}
			case 2 :{
				System.out.println("Here is your Chicken Dum Biryani");
				System.out.println("It feels Sukkonnn");
				break;}
			case 3:{
				System.out.println("Here is your Mutton Murg Biryani");
				System.out.println("It feels Sukkonnn");
				break;}
			case 4:{
				System.out.println("Here is your Chittimutyala Chicken Puloa");
				System.out.println("It feels Sukkonnn");
				break;}
			
			}
		case 3 :
			System.out.println("********STATERS*********");
			System.out.println("1 . Venilla Gulab jamun");
			System.out.println("2 . Kunafa");
			System.out.println("3 . Dark Forest Cake");
			System.out.println("4 . Choclate Brownie");
			int d = sc.nextInt();
			switch(d) {
			case 1:{
				System.out.println("Here is your Venilla Gulab jamun");
				System.out.println("Enjoy it");
				break;}
			case 2 :{
				System.out.println("Here is your Kunafa");
				System.out.println("Enjoy it");
				break;}
			case 3:{
				System.out.println("Here is your Dark Forest Cake");
				System.out.println("Enjoy It");
				break;}
			case 4:{
				System.out.println("Here is your Choclate Brownie");
				System.out.println("Enjoy it");
				break;}
			
			}
		}System.out.println("Do you want to continue :");
		s=sc.next();
		}while(s.equalsIgnoreCase("Yes")); 
			
		
		
	}

}
