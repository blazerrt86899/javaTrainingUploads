/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 12.30pm
 *Employee Id: 844549
 *DESC: Implementation of Getter and Setter Methods
 * */
package com.cts;



public class EmployeeTest {

	public static void main(String[] args) {
		  Employee e1 = new Employee();
		  Employee e2 = new Employee();
		  
		  
		  System.out.println("===Before Setting values===");
		  System.out.println("Employee id is: "+e1.getEmpId());
		  System.out.println("Employee Name is: "+e1.getEmpName());
		  System.out.println("Employee Address is: "+e1.getEmpAdd());
		  System.out.println("Employee CompanyName is "+e1.getcompanyName());
		  
		  System.out.println("--------------------------------------");
		  
		  e1.setEmpId(1001);
		  System.out.println("Employee id is: "+e1.getEmpId());
		  e1.setEmpName("Romu Tiwari");
		  System.out.println("Employee Name is: "+e1.getEmpName());
		  e1.setEmpAdd("Ghar");
		  System.out.println("Employee Address is: "+e1.getEmpAdd());
		  e1.setcompanyName("Cognizant");
		  System.out.println("Employee CompanyName is "+e1.getcompanyName());
		  
		  System.out.println("---------------------------------------");
		  
		  e2.setEmpId(1005);
		  System.out.println("Employee id is: "+e2.getEmpId());
		  e2.setEmpName("Dummy");
		  System.out.println("Employee Name is: "+e2.getEmpName());
		  e2.setEmpAdd("Home");
		  System.out.println("Employee Address is: "+e2.getEmpAdd());
		  System.out.println("Employee CompanyName is "+e2.getcompanyName());
		  
		  System.out.println("-----------------------------------------");
		  
		  
		  

	}

}
