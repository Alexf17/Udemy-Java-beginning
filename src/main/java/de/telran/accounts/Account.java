package de.telran.accounts;

public abstract class Account {
    protected double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void status(){
        System.out.printf("Your balance : %.2f\n", balance);
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
