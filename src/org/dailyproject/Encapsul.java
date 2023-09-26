package org.dailyproject;

public class Encapsul {
	private String empname = "Vinod";

	public String getname() {
		return empname;
	}

	private int empid = 6007;

	public int getid() {
		return empid;
	}

	public void setname(String name) {
		this.empname = name;
	}

	public void setid(int num) {
		this.empid = num;
	}

}
