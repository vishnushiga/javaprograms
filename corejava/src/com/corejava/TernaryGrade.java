package com.corejava;
import java.util.Scanner;

public class TernaryGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = (a>=90)?"A":(a>=75)?"B":(a>=60)?"C":(a>=35)?"D":"Fail";
		System.out.println(result);

	}

}
