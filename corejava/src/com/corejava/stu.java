package com.corejava;

public class stu {
	static int count = 0;
	{
		count = count+1;
	}

	public static void main(String[] args) {
		
        stu shiva = new stu();
        stu sujith = new stu();
        stu vicky = new stu();
        System.out.println("count: "+count);
        
        stu vicky2 = new stu();
        System.out.println("count: "+count);
        
	}

}
