/*Author: Romu Tiwari
 *Day: 06/01/2020
 *Creation Time: 04.54pm
 *Employee Id: 844549
 *DESC: POJO Class for a Student
 * */
package com.in;

public class Student {
	
	public Student(){
		
	}
	
	private static String courseName;
	private String studentName;
	private int studentId;
	
	//Getters and setters
	
	public String getcourseName() {
		return courseName;
	}
	
	public void setcourseName(String courseName) {
		Student.courseName = courseName;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getstudentId() {
		return studentId;
	}
	
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public Student(int studentId,String studentNname) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	

}
