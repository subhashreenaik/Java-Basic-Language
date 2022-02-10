package com.practice.day4;

public class DefaultConstructor {
	
	DefaultConstructor(){
		System.out.println("Inside the default constructor");
		
	}
	DefaultConstructor(String s){
		System.out.println(s+" is inside the paramiterised construtor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor a =new DefaultConstructor();
		DefaultConstructor b =new DefaultConstructor("Ram");
	}

}
