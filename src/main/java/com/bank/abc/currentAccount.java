package com.bank.abc;

public class currentAccount extends Account {
	float overdraftLimit;

	public float getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(float overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public currentAccount(int accountNumber, customerDetail customer, double accountBalance, float overdraftLimit) {
		super(accountNumber, customer, accountBalance);
		this.overdraftLimit = overdraftLimit;
	}
	
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Overdraft Limit : " + overdraftLimit);
	}

	
}
