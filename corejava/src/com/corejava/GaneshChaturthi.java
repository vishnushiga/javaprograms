package com.corejava;
import java.util.Scanner; 
public class GaneshChaturthi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ganesh Booking :");
		boolean a = sc.nextBoolean();
		System.out.println("Centring & Mandapam :");
		boolean s = sc.nextBoolean();
		System.out.println("Interior decoration :");
		boolean d = sc.nextBoolean();
		System.out.println("Panthulu :");
		boolean f = sc.nextBoolean(); 
		System.out.println("Bhaarath :");
		boolean g = sc.nextBoolean();
		if(a) {
			System.out.println("Bada ganesh tho halchal ipovali");
			if(s) {
				System.out.println("Gopuram type untadhi");
				if(d) {
					System.out.println("Mad undali");
					if(f) {
						System.out.println("2 times puja unadali");
					}else {
						System.out.println("vere panthulu chudham");
					}
					if(g){
						System.out.println("bhaarath lyt ipothe pungibaja istaru");
					}else {
						System.out.println("ok ok");
					}
				}else {
					System.out.println("decoration lyt unte maatochestadhi");
				}
			}else {
				System.out.println("espl undali");
			}
		}else {
			System.out.println("nxt time for sure");
		}
		

	}

}
