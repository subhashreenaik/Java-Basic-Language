package com.example.Day3;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int a[] = {3,5,3,7,2,1};
	
		for (int i = 0; i < a.length; i++) {
		     for (int j = i + 1 ; j < a.length; j++) {
		          if (a[i] == (a[j])) {
		        	  System.out.println("The elements which are duplicates  "+a[i]);
		          }
		                  
		          }
		     }
		}
	}
		     