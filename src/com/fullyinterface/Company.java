package com.fullyinterface;

public class Company implements Employee,Client{

	@Override
	public void empName() {
		System.out.println("abc");
		
	}

	@Override
	public void empDetail() {
		System.out.println("manager");
		
	}

	@Override
	public void empstatus() {
		System.out.println("good");
		
	}

	public static void main(String[] args) {
		Company c=new Company();
		c.empName();
		c.empDetail();
		c.empstatus();
		c.clientName();
		c.clientDetail();
	}

	@Override
	public void clientName() {
		System.out.println("qqqq");
		
	}

	@Override
	public void clientDetail() {
		System.out.println("chennaiclient");
		
	}
}
