package org.dailyproject;

public class Bank {
	private int minimumBalance = 5000;

	public int getMinimumBalance() {
		return this.minimumBalance;// here returning variable of value
	}

	public void setMinimumBalance(int value) {
		if (value > 5000)
			this.minimumBalance = value;
	}
}
