// Access Modifiers
//Private

public class BankAccount {
    private double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // You can put the main method inside the public class itself!
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.showBalance();
    }
}