package com.corejava;
import java.util.Scanner;
public class CompanyBonusternary {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Rating :");
	int r = sc.nextInt();
	String bonus = (r>=4)?"Eligible":"Not Elegible";
	System.out.println(bonus);
	}

}
