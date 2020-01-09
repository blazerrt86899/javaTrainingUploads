/*Author: Romu Tiwari
 *Day: 08/01/2020
 *Creation Time: 12:00pm
 *Employee Id: 844549
 *DESC: Inheritance Demo using constructor calls
 * */
package javaDay2;

public class Employee {
	
	int empId;
	String compName;
	String name;
	String dept;
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", compName=" + compName + ", name=" + name + ", dept=" + dept + "]";
	}

	public Employee() {
		
	}
	
	public Employee(int id,String name,String comp,String dept2) {
		
		this.empId = id;
		this.compName = name;
		this.name = name;
		this.dept = dept2;
	}
	
	public void work() {
		System.out.println("Working");
	}
	
	public void checkProfile() {
		System.out.println("check profile");
	}

}
