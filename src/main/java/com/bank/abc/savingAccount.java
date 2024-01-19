package com.bank.abc;

public class savingAccount extends Account {
	float interestRate;

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public savingAccount(int accountNumber, customerDetail customer, double accountBalance, float interestRate) {
		super(accountNumber, customer, accountBalance);
		this.interestRate = interestRate;
	}
	
	

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Interest Rate : " + interestRate);
	}

	
	
}
