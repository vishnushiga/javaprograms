package com.corejava;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		char vowel = sc.next().charAt(0);
		vowel = Character.toLowerCase(vowel);
		
		String ans = (vowel=='a'||vowel == 'e'||vowel=='i'||vowel=='o'||vowel=='u')
				     ? "vowel"
				     :"Consonent";
		System.out.println(ans);
//		String ans = (vowel)?"T":"F";

	}

}
//Write a Java program to check whether a given character is a vowel or a consonant using the ternary operator.

