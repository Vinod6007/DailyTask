package org.dailyproject;

public class HierarichicalInheritance2 extends Country {//subclass 2
	public void statename() {
		System.out.println("subclass 2 : karnataka");
	}
	public static void main(String[] args) {
		HierarichicalInheritance2 h2=new HierarichicalInheritance2();
		h2.statename();
		h2.countryname();
	}

}
