package com.polymorphism;

public class Methodoverridingchildclass extends Methodoverriding {
	@Override
	public void computermodel() {
		System.out.println("new model 123");
		super.computermodel();
	}
	@Override
	public void moniterSize() {
		System.out.println("new size 34inch");
		super.moniterSize();
	}
	@Override
	public void memory() {
		System.out.println("new memory500gb");
		super.memory();
		this.computermodel();
	}
public static void main(String[] args) {
	Methodoverridingchildclass m=new Methodoverridingchildclass();
	m.computermodel();
	m.moniterSize();
	m.memory();
}
}
