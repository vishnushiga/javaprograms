package com.Oops;

public class Student1 {
	private int stuid;
	String sname;
	float marks;
	
	private void setStuid(int stuid){
		this.stuid = stuid;
	}
	
	private int getStuid() {
		return stuid;
	}
	
	private void setSname(String sname) {
		this.sname = sname;
	}
	
	private String getSname() {
		return sname;
	}
	
	private void setMarks(float marks) {
		if(marks>0 & marks<=100)
		this.marks = marks;
	}
	
	private float getMarks() {
		return marks;
	}

}
