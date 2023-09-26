package org.dailyproject;

public class Encap2 extends Encapsul {

	public static void main(String[] args) {
		Encap2 e1 = new Encap2();
		String val = e1.getname();
		System.out.println(val);
		e1.setname("Karthi");
		System.out.println(e1.getname());
		int val2 = e1.getid();
		System.out.println(val2);
		e1.setid(7007);
		System.out.println(e1.getid());

	}

}
