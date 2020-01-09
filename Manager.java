
/*Author: Romu Tiwari
 *Day: 08/01/2020
 *Creation Time: 12:00pm
 *Employee Id: 844549
 *DESC: Inheritance Demo using constructor calls
 * */
package javaDay2;

public class Manager extends Employee{
	
	public Manager() {
		
	}
	
	public Manager(int id,String name,String comp,String dept) {
		super(id,name,comp,dept);
		System.out.println("Object of Manager created");
		
	}

}
