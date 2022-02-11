package com.example.Day3;

public class MaxAndMinValueFromArray {

	public static void main(String[] args) {
		int max=0;
		int min=100;
		int arr[] = {5,4,78,23,45};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("Max value of array is "+max);
		
		
		System.out.println("Max value of array is "+min);
	}

}
