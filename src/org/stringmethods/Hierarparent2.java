package org.stringmethods;

public class Hierarparent2 extends Hirarparent1 {
	public void parantFathername() {
		System.out.println("father");

	}
	public void parentmotherNmame() {
		System.out.println("mother");

	}
public static void main(String[] args) {
	Hierarparent2 hi=new Hierarparent2();
	hi.grantfatherName();
	hi.grantmotherName();
	hi.parantFathername();
	hi.parentmotherNmame();
}
}
