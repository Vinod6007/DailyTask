package org.dailyproject;

public class Bank {
	private int minimumBalance = 5000;

	public int getMinimumBalance() {
		return minimumBalance;// here returning variable of value
	}

	public void setMinimumBalance(int value) {
		if (value > 5000)
			minimumBalance = value;
	}
}
