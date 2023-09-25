package org.dailyproject;

public class Abstract1child extends Abstract1 implements Abstract2 {
	void empDetails() {// default
		System.out.println("Testing Engineer");
	}

	public static void main(String[] args) {
		Abstract1.department();
		Abstract1child a = new Abstract1child();
		a.empDetails();
		a.empname();
		a.id();
		a.cmpId();
		a.cmpname();

	}

	@Override
	void id() {
		System.out.println("6007");
	}

	@Override
	public void cmpId() {
		System.out.println(b);
	}

	@Override
	public void cmpname() {
		System.out.println(a);

	}

}
