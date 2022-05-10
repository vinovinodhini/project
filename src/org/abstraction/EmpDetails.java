package org.abstraction;

public class EmpDetails extends PartialAbstraction {
	@Override
	public void emponeDetail() {
		System.out.println("abc01");
	//super.companyshare();	
	}
	@Override
	public void emptwoDetails() {
		System.out.println("executive");
	}
public static void main(String[] args) {
	EmpDetails ed=new EmpDetails();
	ed.compantDetails();
	ed.companyshare();
	ed.emponeDetail();
	ed.emptwoDetails();
}
}
