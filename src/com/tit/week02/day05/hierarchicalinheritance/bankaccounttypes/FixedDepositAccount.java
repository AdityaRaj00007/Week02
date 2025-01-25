package com.tit.week02.day05.hierarchicalinheritance.bankaccounttypes;
public class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        accountType();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
    void accountType(){
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
