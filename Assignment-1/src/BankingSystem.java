import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        int accNum = sc.nextInt();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNum, balance);

        System.out.print("\nDeposit Amount: ");
        double depositAmt = sc.nextDouble();
        acc.deposit(depositAmt);

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmt = sc.nextDouble();
        acc.withdraw(withdrawAmt);
    }
}
