package com.corejava;

public class Movie {
	String director;
	String movie;
	String hero;
	String heroine;
	String producer;
	double budget;
	
	Movie(){
		
	}
	Movie(String director){
		this.director=director;
	}
	Movie(Movie m,String movie){
		this.director=m.director;
		this.movie=movie;
		
	}
	Movie(Movie m,String hero,String heroine){
		
		this.director=m.director;
		this.movie=m.movie;
		this.hero=hero;
		this.heroine=heroine;
	}
	Movie(Movie m,String producer,double budget){
	
		this.director=m.director;
		this.movie=m.movie;
		this.hero=m.hero;
		this.heroine=m.heroine;
		this.producer=producer;
		this.budget=budget;
	}


	public static void main(String[] args) {
		Movie m = new Movie("SS RAJAMOULI");
//		m.display();
		Movie m1 = new Movie(m,"BAAHUBALI");
//		m1.display();
		Movie m2 = new Movie(m1,"PRABOSS","ANUSHKA SWEETY");
//		m2.display();
		Movie m3 = new Movie(m2,"SHAMBU",500000);
		m3.display();
		

	}
	void display() {
		System.out.println("Name of the Director : "+director);
		System.out.println("Name of the Movie :"+movie);
		System.out.println("Name of the Hero : "+hero);
		System.out.println("Name of the heroine : "+heroine);
		System.out.println("Name of the Producer : "+producer);
		System.out.println("Name of the Budget : "+budget);


	}
	

}
