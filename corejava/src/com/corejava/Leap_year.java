package com.corejava;
import java.util.Scanner;

public class Leap_year {

      void main(String[] args) {
    	  int b;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the Year :");
    	  int a = sc.nextInt();
    	  if(a<0) {
    		  System.out.println("Not a Leap Year");
    	  }
    	  else if(a%400==0) {
    		  System.out.println("Leap Year");
    	  }
    	  else if((a%100==0)&&(a%400!=0)) {
    		  System.out.println("Not leap year");
    	  }
    	  else if((a%4==0)&&(a%100!=0)) {
    		  System.out.println("Leap year");
    	  }
    	  else {
    		  System.out.println("Not a Leap Year");
    	  }

	}

}
