package org.dailyproject;

public class Num {
	static int a = 10;
	int b = 2;

	Num() { // constructor
		this.a++;
		System.out.println(a);// 11
	}

	public void add() {
		a = a + 1;
		a = b + 2;
		System.out.println(a);
	}

	public void multi() {// n1        n2
		a = a + 1; //      10+1=11   11+1=12
		a = b * 2; //       2*2=4    2*2=4
		System.out.println(a);
	}

}
