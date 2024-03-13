package com.driver;

public class BankAccount {
	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
       // your code goes here
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=initialBalance;
    }

    public double getBalance() {
    	// your code goes here
        return balance;
    }

    public void deposit(double amount) {
    	// your code goes here
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Updated balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
    	// your code goes here
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw.");
        }
        balance -= amount;
    }
}
