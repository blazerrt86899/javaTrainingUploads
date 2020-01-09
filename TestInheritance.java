/*Author: Romu Tiwari
 *Day: 08/01/2020
 *Creation Time: 12:00pm
 *Employee Id: 844549
 *DESC: Inheritance Demo using constructor calls
 * */
package javaDay2;

public class TestInheritance {
	
	

	public static void main(String[] args) {
		
		Admin ad = new Admin(1001,"Romu","CTS","Admin");
		Manager mg = new Manager(1002,"Rahul","CTS","Manager");
		
		ad.work();
		ad.checkProfile();
		
		mg.work();
		mg.checkProfile();
		
		System.out.println(ad.toString());
		System.out.println(mg.toString());
		
		

	}

}
