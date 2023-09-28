package org.dailyproject;

public class AccountHolder extends Bank {
	public static void main(String[] args) {
		AccountHolder a = new AccountHolder();
		int min = a.getMinimumBalance();
		System.out.println(min);
		a.setMinimumBalance(4000);
		System.out.println(a.getMinimumBalance());
	}
}
