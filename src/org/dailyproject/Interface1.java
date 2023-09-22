package org.dailyproject;

public class Interface1 implements A,B {
	public void empname() {
System.out.println(a);
	}
	public void empid() {
System.out.println(b);
	}
	public static void main(String[] args) {
		Interface1 i=new Interface1();
		i.empname();
		i.empid();
	}

}
interface A {
	String a="Vinod";
	void empname();
	
	
}
interface B{
	String b="VND6007";
	void empid();
	
}