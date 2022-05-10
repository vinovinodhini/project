package org.stringmethods;

public class MultilevelChild extends Multilevelpar2 {		//child class
	private void empName() {
		System.out.println("mnb");

	}
	private void empadd() {
		System.out.println("namakkal");
		super.hdfcempName();
		this.empName();

	}
	public static void main(String[] args) {
		MultilevelChild ml=new MultilevelChild();
		ml.hdfcBankid();
		ml.hdfcempName();
		ml.indBankempid();
		ml.hdfcempSalary();
		ml.empadd();
		ml.empName();
		
	
	}

}
