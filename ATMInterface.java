import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount deposited: ₹" + amount);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance for withdrawal!");
        } else {
            balance -= amount;
            System.out.println("✅ Amount withdrawn: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("💰 Your current bank balance: ₹" + balance);
    }
}

public class ATMInterface {
    private BankAccount account;

    public ATMInterface(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("👋 Thanks for using the ATM Machine!");
                    break;

                default:
                    System.out.println("❌ Invalid input! Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00);
        ATMInterface atm = new ATMInterface(userAccount);
        atm.showMenu();
    }
}
