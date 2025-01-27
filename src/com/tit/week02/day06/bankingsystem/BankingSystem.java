package com.tit.week02.day06.bankingsystem;
import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("1478523697895475", "Aditya Raj Gupta", 50000, 4);
        BankAccount current = new CurrentAccount("1236547897418529", "Aadarsh Gupta", 20000, 1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
            System.out.println("Total Balance: " + (account.getBalance() + account.calculateInterest()));


            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(5000);
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
