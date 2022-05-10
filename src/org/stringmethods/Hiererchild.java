package org.stringmethods;

public class Hiererchild extends Hirarparent1 {
	private void girlNmae() {

System.out.println("girl");
	}
private void boyName() {
	System.out.println("boy");

}
public static void main(String[] args) {
	Hiererchild h=new Hiererchild();
	h.boyName();
	h.girlNmae();
	h.grantmotherName();
	h.grantfatherName();

}
}
