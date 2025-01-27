package com.tit.week02.day06.bankingsystem;
public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically don't have interest, return 0
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        // Simplified loan application process
        System.out.println("Applying for a loan of " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Simplified eligibility check
        return getBalance() > 1000;
    }
}
