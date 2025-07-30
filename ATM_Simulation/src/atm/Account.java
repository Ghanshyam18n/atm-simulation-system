package atm;

public class Account {
    private String accountHolder;
    private int pin;
    private double balance;

    public Account(String accountHolder, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void printMiniStatement() {
        System.out.println("\n----- Mini Statement -----");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Available Balance: Rs." + balance);
        System.out.println("--------------------------\n");
    }
}
