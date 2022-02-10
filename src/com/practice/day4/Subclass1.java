package com.practice.day4;

public class Subclass1 extends OverridingPrent {
	void Display() {
		System.out.println("subclass1");
		}
	
	public static void main(String[] args) {
		// Showing overriding concept
		OverridingPrent p=new Subclass1();
		p.Display();
		
	}

}
