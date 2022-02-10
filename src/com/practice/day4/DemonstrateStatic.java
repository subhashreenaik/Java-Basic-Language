package com.practice.day4;

public class DemonstrateStatic {
	
	static int a=14;
	static  {
    	System.out.println(" static block will execute first.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Then main method  will execute ."); 
		a++;
        System.out.println(" Value of a "+a+"have one copy through out the class. ");
	}

}
