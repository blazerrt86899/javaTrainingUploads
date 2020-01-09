/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 04.40pm
 *Employee Id: 844549
 *DESC: Testing package visibility (public)
 * */
package com.cts;

import com.in.PackageDemo;

public class PackageDemo1{

	public static void main(String[] args) {
		PackageDemo pd = new PackageDemo();
		System.out.println("b value is "+pd.b);
		

	}

}
