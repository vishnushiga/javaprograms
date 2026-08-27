package com.Oops;
import java.util.Scanner;
public class Student1_results {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student id : ");
		int stuid = sc.nextInt();
		System.out.println("Enter the Student Name : ");
		sc.nextLine();
		String sname = sc.next();
		System.out.println("Enter the marks : ");
		float marks = sc.nextFloat();
		Student1 stu1 = new Student1();
		System.out.println("**************************");
		System.out.println(stuid);
		System.out.println(sname);
		System.out.println(marks);
	}

}
