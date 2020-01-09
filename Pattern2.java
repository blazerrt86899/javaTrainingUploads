package com.cts;

public class Pattern2 {

	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<=n;i++) {
			for(int j = i-1;j<n;j++) {
				System.out.print(" ");
			}
				for(int k = 1;k<=(2*i - 1);k++) {
					 
						System.out.print("*");
					
					
						System.out.print(" ");
					
				}
				System.out.println();
				
			
		}
	}

}
