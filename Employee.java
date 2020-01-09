/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 12.30pm
 *Employee Id: 844549
 *DESC: Created Getter and Setters for Employee Class
 * */
//Employee POJO Class
package com.cts;

//POJO -plain old java object
public class Employee {
//	all variables should be private
//	should have a no arg cons
//	getter and setter for all private variable
	
	private int empId;
	private String empName;
	private String empAdd;
	private static String companyName;
	
	public Employee() {
		
	}
	
	public String getcompanyName() {
		return companyName;
	}
	
	public void setcompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	public Employee(int empId,String empName,String empAdd) {
		this.empAdd = empAdd;
		this.empId = empId;
		this.empName = empName;
	}

}
