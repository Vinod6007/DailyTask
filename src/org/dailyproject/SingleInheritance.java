package org.dailyproject;

public class SingleInheritance extends EmployeeDetails {

	public static void main(String[] args) {
		EmployeeDetails.empId();// call the static method

		SingleInheritance s = new SingleInheritance(); // create the object with new keyword
		s.empname();// call the non static method
	}
}

class EmployeeDetails {// I have declare Parent class is EmployeeDetails
	public void empname() {// non static method
		System.out.println("Vinod");

	}

	public static void empId() {// static method
		System.out.println("vino6007");
	}
}
