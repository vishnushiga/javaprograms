package com.corejava;
import java.util.Scanner;

public class Grading {

      void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the marks :");
    	  int a = sc.nextInt();
    	  if(a>95 || a<100) {
    		  System.out.println("A+");
    	  }
    	  else if(a>85 || a<94) {
    		  System.out.println("A");
    	  }
    	  else if(a>70 || a<84) {
    		  System.out.println("B");
    	  }
    	  else if(a>50 || a<69) {
    		  System.out.println("C");
    	  }
    	  else {
    		  System.out.println("F");
    	  }

	}

}
