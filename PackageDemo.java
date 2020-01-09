/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 04.40pm
 *Employee Id: 844549
 *DESC: Testing package visibility (Private)
 * */
package com.in;

public class PackageDemo {
	
	private int a;
	public int b;
	int c;
	protected int d;
	
	public static void main(String args[]) {
		PackageDemo pd = new PackageDemo();
		System.out.println("a value is "+pd.a);
	}

	

}


