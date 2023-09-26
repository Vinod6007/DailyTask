package org.newone;

import org.dailyproject.Encapsul;

public class Encapdiffpackage extends Encapsul {

	public static void main(String[] args) {
		Encapdiffpackage e2 = new Encapdiffpackage();
		String val = e2.getname();
		System.out.println(val);
		e2.setname("Karthi");
		System.out.println(e2.getname());
	}

}
