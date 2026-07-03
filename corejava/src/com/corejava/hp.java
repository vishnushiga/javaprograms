package com.corejava;

public class hp {
	@Override
	protected void finalize()  {
		System.out.println("object Destroyed");
	}

	public static void main(String[] args) {
		hp h = new hp();
		System.out.println(h);
		
		hp p = new hp();
		System.out.println(p);
		
		hp q = new hp();
		System.out.println(q);
		
		hp r = new hp();
		System.out.println(r);
		
		q = null;
		r = null;
		System.gc();
		System.out.println("*********************");
		System.out.println(q);
		System.out.println(r);
		System.out.println(h);
		System.out.println(p);
		System.out.println(h.hashCode());

	}

}
