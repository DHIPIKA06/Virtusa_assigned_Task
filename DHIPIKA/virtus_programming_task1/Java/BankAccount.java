import java.util.Scanner;

/**
 * A basic encapsulation example. The balance is kept private and can
 * only be changed through the deposit/withdraw methods, which enforce
 * their own validation rules.
 */
class Account {

    private final String accountHolderName;
    private double balance;

    public Account(String accountHolderName, double openingBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

/**
 * Menu-driven demo that reads the account holder's name, opening
 * balance, and subsequent operations from the user rather than
 * hardcoding them.
 */
public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter opening balance: ");
        double openingBalance = scanner.nextDouble();

        Account account = new Account(name, openingBalance);

        int choice = -1;
        while (choice != 3) {
            System.out.println("\n1. Deposit  2. Withdraw  3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Final balance for " + account.getAccountHolderName()
                            + ": " + account.getBalance());
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
