/*Author: Romu Tiwari
 *Day: 09/01/2020
 *Creation Time: 12:00pm
 *Employee Id: 844549
 *DESC: Polymorphism Implementation
 * */
package javaDay3;

public class TestPoly1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();	
		emp.work();
		emp = new Admin();
		//emp = new Manager();
		//emp = new Trainer();
		
		if(emp instanceof Admin) {

			
			Admin ad = (Admin)emp;
			ad.manageProjects();
		}
		else if(emp instanceof Manager) {
			
			Manager mg = (Manager)emp;
			mg.manageInventory();
		}
		else {
			
			Trainer tr = (Trainer)emp;
			tr.upskilling();
		}
		
		
	
		
		
	
	}

}
