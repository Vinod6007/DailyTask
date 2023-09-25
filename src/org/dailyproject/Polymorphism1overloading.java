package org.dailyproject;

public class Polymorphism1overloading {
	private void employee() {
		System.out.println("Shimakh Technology");
	}

	public void employee(String name) {// non-static method
		System.out.println("Vinodhagan");
	}

	 void employee(int id) {//default non static method
		System.out.println(701);
	}

	private static void employee(String name, int id) {// static method
		System.out.println("employee Details");
	}

	public static void main(String[] args) {
		Polymorphism1overloading p = new Polymorphism1overloading();
		p.employee();
		p.employee("");
		p.employee(7);
		Polymorphism1overloading.employee("vino", 6007);
	}

}
