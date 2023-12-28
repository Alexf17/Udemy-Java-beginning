package de.telran.accounts;

public class SavingAccount extends  Account {
    public SavingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
       double fee = 0.02 * amount;
       amount+=fee;
     return super.withdraw(amount);
    }
}
