package org.stringmethods;

public class Singleinheritance extends Check {		//child singleinheritance
	private void empAdd() {
		System.out.println("salem");

	}
private void empphone() {
	System.out.println("1234567890");
	super.empid();
	this.empAdd();

}
public static void main(String[] args) {
	Singleinheritance s=new Singleinheritance();
	//s.empid();
	s.empName();
	s.empphone();
	//s.empAdd();
	s.empSalary();
	
}
}
