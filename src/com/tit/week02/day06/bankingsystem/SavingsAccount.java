package com.tit.week02.day06.bankingsystem;
public class SavingsAccount extends BankAccount implements  Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate/100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for a loan of " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Simplified eligibility check
        return getBalance() > 1000;
    }
}
