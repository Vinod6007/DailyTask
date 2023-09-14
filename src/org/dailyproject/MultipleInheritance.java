package org.dailyproject;

public class MultipleInheritance extends Color {// subclass 3 extends subclass 2

	public static void main(String[] args) {
		Color.carcolor();// call the static method

		MultipleInheritance m = new MultipleInheritance();// create the object with new keyword
		m.carname();//call the non static method
		m.modelno();//call the non static method
	}
}

class Car {// Parent class
	public void carname() {
		System.out.println("Toyota");
	}
}

class Model extends Car {// subclass 1 extends parent class
	public void modelno() {
		System.out.println("RAV4");
	}
}

class Color extends Model {// subclass 2 extends subclass 1
	public static void carcolor() {
		System.out.println("Black");
	}
}