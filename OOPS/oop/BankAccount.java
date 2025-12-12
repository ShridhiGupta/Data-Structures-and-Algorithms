public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void getDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "Alice", 5000.0);
        BankAccount account2 = new BankAccount(102, "Bob", 3000.0);
        BankAccount account3 = new BankAccount(103, "Charlie", 7000.0);
        account1.deposit(1500.0);
        account2.withdraw(500.0);       
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
        System.out.println("Account 3 Balance: " + account3.getBalance());
        account1.getDetails();
        account2.getDetails();
        account3.getDetails();
    }
}
