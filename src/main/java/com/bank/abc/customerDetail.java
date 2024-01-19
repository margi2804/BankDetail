package com.bank.abc;

public class customerDetail {
	int customerId;
    String name;

    public customerDetail(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
    }
}
