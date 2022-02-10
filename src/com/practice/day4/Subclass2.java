package com.practice.day4;

public class Subclass2 extends OverridingPrent {
	
	void Display() {
	
		System.out.println("subclass2 and the value of x is "+super.x);
		}
	public static void main(String[] args) {
		// Single level Inheritance
		OverridingPrent p =new OverridingPrent();
		p.Display();
		Subclass2 s2 =new Subclass2();
		s2.Display();
		

	}

}
