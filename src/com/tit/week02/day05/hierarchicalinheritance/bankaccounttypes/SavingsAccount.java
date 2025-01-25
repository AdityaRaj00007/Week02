package com.tit.week02.day05.hierarchicalinheritance.bankaccounttypes;
public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        accountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    void accountType(){
        System.out.println("Account Type: Saving Account");
    }
}
