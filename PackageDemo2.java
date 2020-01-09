/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 04.40pm
 *Employee Id: 844549
 *DESC: Testing package visibility (Protected)
 * */
package com.cts;

import com.in.PackageDemo;

public class PackageDemo2 extends PackageDemo{

	public static void main(String[] args) {
		PackageDemo2 pd = new PackageDemo2();
		System.out.println("d value is "+pd.d);
		

	}

}
