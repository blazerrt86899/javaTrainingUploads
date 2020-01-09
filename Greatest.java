package com.cts;

public class Greatest {
	public static void main(String args[]) {
		int a = -7, b=-5;
		int biggest = ((a+b) + Math.abs(a-b))/2;
		System.out.println("Biggest is "+biggest);
		
		int smallest = ((a+b) - Math.abs(a-b))/2;
		System.out.println("Smallest is "+smallest);
	}

}
