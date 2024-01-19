package com.bank.abc;

public class App 
{
    public static void main( String[] args )
    {
    	customerDetail customer1 = new customerDetail(1, "Miranda Shaffer");
    	customerDetail customer2 = new customerDetail(2, "Irene Pitts");
    	
    	
    	System.out.println("Saving Account Details:");
    	System.out.println("-------------------------------------------");
    	savingAccount sa1 = new savingAccount(111,customer1,15438.35,10);
    	sa1.displayInfo();
    	System.out.println("...........................................");
    	savingAccount sa2 = new savingAccount(112,customer2,1988.15,5);
    	sa2.displayInfo();
    	
    	System.out.println("*******************************************");
    	
    	System.out.println("Current Account Details:");
    	System.out.println("-------------------------------------------");
    	currentAccount ca1 = new currentAccount(222,customer1,31854.68,1000);
    	ca1.displayInfo();
    	System.out.println("...........................................");
    	currentAccount ca2 = new currentAccount(223,customer2,9568.96,3055);
    	ca2.displayInfo();      
    }
}
