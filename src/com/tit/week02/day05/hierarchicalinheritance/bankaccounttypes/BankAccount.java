package com.tit.week02.day05.hierarchicalinheritance.bankaccounttypes;

public abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
    }
    abstract void accountType();
}

