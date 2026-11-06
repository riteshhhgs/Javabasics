class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    public BankAccount() {
        accountNumber = "ACC000";
        accountHolderName = "New Customer";
        balance = 1000.0;
        accountType = "Savings";
    }
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = 1000.0;
        accountType = "Savings";
    }
    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber +
                ", Holder: " + accountHolderName +
                ", Balance: " + balance +
                ", Type: " + accountType);
    }
}

public class Leb {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("ACC12345", "Rajesh Kumar");
        BankAccount acc3 = new BankAccount("ACC67890", "Sunita Reddy", 50000.0, "Current");

        System.out.println("Account 1 (Default Constructor):");
        acc1.displayAccountInfo();

        System.out.println("\nAccount 2 (2-Parameter Constructor):");
        acc2.displayAccountInfo();

        System.out.println("\nAccount 3 (4-Parameter Constructor):");
        acc3.displayAccountInfo();
    }
}