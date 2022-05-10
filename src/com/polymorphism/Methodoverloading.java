
package com.polymorphism;

public class Methodoverloading {
	private void car(String name) {
		System.out.println(name);
	}
private void car(int number) {
	System.out.println("number:"+number );
}
private void car(double carid) {
	System.out.println("carid:"+carid);

}
public static void main(String[] args) {
	Methodoverloading mo=new Methodoverloading();
	mo.car(01);
	mo.car("lenovo");
	mo.car(12234d);
}
}
