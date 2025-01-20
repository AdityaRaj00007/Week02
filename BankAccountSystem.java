class BankAccout{
    private static String bankName = "HDFC Bank"; // BankName shared among all instance
    private final long accountNumber; // To ensure it cannot be changed
    private String accountHolderName;
    static int totalAccount = 0;
    // Parameterised Constructor
    BankAccout(long accountNumber , String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccount++;
    }
    // Method to get Total Account
    static void getTotalAccouts(){
        System.out.println("Total Number of Account is: " + totalAccount);
    }
    void displayDetails(){
        if(this instanceof BankAccout){
            System.out.println("Bank Name: " + bankName + "\nAccount Holder Name: " + accountHolderName + "\nAccount Number: " + accountNumber);
        }
        else{
            System.out.println("Invaild Account");
        }
    }
}
class BankAccountSystem{
    public static void main(String[] args) {
        BankAccout bankAccout1 = new BankAccout(782883905 , "Aditya Raj Gupta");
        BankAccout bankAccount2 = new BankAccout(147258369 , "Ankit Gangwani");
        BankAccout.getTotalAccouts();
        bankAccout1.displayDetails();
        bankAccount2.displayDetails();
    }
}