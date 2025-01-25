package com.tit.week02.day05.hierarchicalinheritance.bankaccounttypes;
public class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        accountType();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
    void accountType(){
        System.out.println("Account Type: Checking Account");
    }
}
