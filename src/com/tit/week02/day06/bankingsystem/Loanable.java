package com.tit.week02.day06.bankingsystem;
public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
