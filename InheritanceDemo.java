/*Author: Romu Tiwari
 *Day: 08/01/2020
 *Creation Time: 09.30am
 *Employee Id: 844549
 *DESC: Inheritance Demo
 * */
package javaDay2;

public class InheritanceDemo {
	
	public static void main(String args[]) {
		ScientificCalculator sc = new ScientificCalculator();
		ProgrammingCalculator pc = new ProgrammingCalculator();
		Calculator calc = new Calculator();
		
		//For Scientific Calculator
		sc.add(7,6);
		sc.sub(9,6);
		sc.sin();
		sc.cos();
		
		//For Programming Calculator
		pc.add(2,6);
		pc.sub(10,6);
		pc.hexValue();;
		pc.octValue();
		
		//For Calculator 
		calc.sub(7,6);
		calc.add(8,6);
	}
	
	
}
