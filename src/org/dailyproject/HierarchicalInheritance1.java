package org.dailyproject;

 public class HierarchicalInheritance1 extends Country {//subclass 1
	 private void districtname() {
System.out.println("subclass 1: Bangalore");
	}
public static void main(String[] args) {
	HierarchicalInheritance1 h1=new HierarchicalInheritance1();
	h1.countryname();
	h1.districtname();
	
}
}
class Country{//parent class//superclass
	public void countryname() {
		System.out.println("Parent class : India");

	}
}
	
