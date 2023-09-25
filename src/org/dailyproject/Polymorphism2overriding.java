package org.dailyproject;

public class Polymorphism2overriding extends Polymorphism1overloading {
	public void carname() {
		System.out.println("BMW");
	}
	public void modelno() {
		System.out.println("M340i");
		}
	public static void carcolor() {
		System.out.println("White");
	}
	public void sum(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}


	public static void main(String[] args) {
		Polymorphism2overriding p2=new Polymorphism2overriding();
		p2.carname();
		p2.modelno();
		Polymorphism2overriding.carcolor();
		p2.sum(10, 15);

	}

}
