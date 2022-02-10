package com.practice.day4;

public class Overloading {
    static int addition(int a,int b) {
		return a+b;
    }
    
    static int addition(int a,int b,int c) {
		return a+b+c;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Its showing compile time polymorphism");
		System.out.println("Addition of two Integer"+addition(7, 8));
		System.out.println("Addition of three Integer"+addition(2, 5, 6));

	}

}
