import java.util.Scanner;
class BankAccout {
    // Attributes of the bank account
    String accountHolder; 
    long accountNumber;   
    double balance; 

    // Constructor to initialize account details
    BankAccout(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    void depositeMoney(double amount) {
        balance += amount; // Add the deposit amount to the current balance
    }

    // Method to withdraw money from the account
    void WithdrawMoney(double amount) {
        // Check if there is sufficient balance for the withdrawal
        if (balance > amount) {
            balance -= amount; // Deduct the withdrawal amount from the current balance
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display the current account balance
    void displayBalance() {
        System.out.println("Current Balance of your account is: " + balance);
    }
}

public class ATMSimulater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather account details from the user
        System.out.println("Enter the Name of account holder: ");
        String accountHolder = input.nextLine();

        System.out.println("Enter the account number: ");
        long accountNumber = input.nextLong();

        System.out.println("Enter the Balance of account: ");
        double balance = input.nextDouble();

        // Create a BankAccount object with the provided details
        BankAccout bankaccount = new BankAccout(accountHolder, accountNumber, balance);

        // Ask the user if they want to deposit money
        System.out.println("Do you want to deposit money? Type Yes or No");
        String response = input.next();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter amount you want to deposit in the account: ");
            long amount = input.nextLong();
            bankaccount.depositeMoney(amount); // Call deposit method
        }

        // Ask the user if they want to withdraw money
        System.out.println("Do you want to withdraw money? Type Yes or No");
        String response1 = input.next();

        if (response1.equalsIgnoreCase("yes")) {
            System.out.println("Enter the amount you want to withdraw from the account: ");
            long amountWithdraw = input.nextLong();
            bankaccount.WithdrawMoney(amountWithdraw); // Call withdraw method
        }

        // Display the current balance of the account
        bankaccount.displayBalance();
        input.close();
    }
}
