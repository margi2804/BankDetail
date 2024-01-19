package com.bank.abc;


public class Account {
	int accountNumber;
	private customerDetail customer;
	double accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Account(int accountNumber, customerDetail customer, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.accountBalance = accountBalance;
	}
	
	public void displayInfo() {
		System.out.println("Account Number : " + accountNumber);
		customer.displayInfo();
		System.out.println("Account Balance : " +accountBalance);
	}
}
