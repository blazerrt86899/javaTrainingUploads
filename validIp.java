package javaDay3;

import java.util.Scanner;

public class validIp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP address: ");
		String ip[] = sc.nextLine().split("\\.");
		
		for(int i=0;i<ip.length;i++) {
			if(Integer.parseInt(ip[i]) >= 0 && Integer.parseInt(ip[i])<256){
				System.out.println("Valid IP");
			}
			
			else {
				System.out.println("Invalid IP");
			}
		}
		
		
		 
		
		
		
	}

}
