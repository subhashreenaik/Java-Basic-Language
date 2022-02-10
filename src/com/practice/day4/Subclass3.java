package com.practice.day4;

public class Subclass3 extends Subclass2 {
	void Display()
    {
        System.out.println("Inside subclass3");
    }
	public static void main(String[] args) {
		// Multilevel inheritance
		Subclass3 s3=new Subclass3();
		s3.Display();
	}

}
