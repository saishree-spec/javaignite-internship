package day13;
import java.util.Random;

class BankAccount {

    private int balance = 10000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(
                Thread.currentThread().getName()
                + " withdrew ₹" + amount
                + " | Balance = ₹" + balance
            );
        } else {
            System.out.println(
                Thread.currentThread().getName()
                + " tried to withdraw ₹" + amount
                + " | Insufficient Balance"
            );
        }
    }

    public synchronized void deposit(int amount) {
        balance = balance + amount;

        System.out.println(
            Thread.currentThread().getName()
            + " deposited ₹" + amount
            + " | Balance = ₹" + balance
        );
    }
}

class WithdrawThread extends Thread {

    BankAccount account;
    Random random = new Random();

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {

            int amount = random.nextInt(1501) + 500; // 500–2000

            account.withdraw(amount);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class DepositThread extends Thread {

    BankAccount account;
    Random random = new Random();

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {

            int amount = random.nextInt(1501) + 500; // 500–2000

            account.deposit(amount);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class BankSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        DepositThread t2 = new DepositThread(account);

        t1.setName("Withdrawal Thread");
        t2.setName("Deposit Thread");

        t1.start();
        t2.start();
    }
}