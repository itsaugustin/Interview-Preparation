package org.example.oops.encapsulation;

/*
Binding code and data together into a single unit are known as encapsulation
here
balance is private → not directly accessible
Only accessed via getBalance, deposit, withdraw
 */
public class BankAccount {

    private double balance; // private = encapsulated

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public getter and setter methods
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
}
