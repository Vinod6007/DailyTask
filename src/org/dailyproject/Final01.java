package org.dailyproject;

public class Final01 extends Final {
/*	void car() { // final variables cannot be edited
		System.out.println("Toyota");
	}

	void carcolor() { // final methods cannot overridden
		System.out.println("Black");
	} */

	public static void main(String[] args) {
		Final01 f = new Final01();
		f.car();
		f.carcolor();
	}

}

class Final extends Final02{                    // final class cannot be inheritance
	final void car() { // declare the final variable
		System.out.println("BMW");
	}

	final void carcolor() {  // declare the final method
		System.out.println("white");
	}

}