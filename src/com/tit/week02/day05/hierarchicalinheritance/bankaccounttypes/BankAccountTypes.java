package com.tit.week02.day05.hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("78585", 5000.0, 2.5);
        CheckingAccount checking = new CheckingAccount("58598", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("85952", 10000.0, 12);

        savings.displayAccountInfo();
        System.out.println();

        checking.displayAccountInfo();
        System.out.println();

        fixedDeposit.displayAccountInfo();
        System.out.println();
    }
}
