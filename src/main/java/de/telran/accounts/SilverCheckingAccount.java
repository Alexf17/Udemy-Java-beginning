package de.telran.accounts;

public class SilverCheckingAccount extends CheckingAccount{
    public SilverCheckingAccount(double balance, double interestRate, int rewordsPoint) {
        super(balance, interestRate, rewordsPoint);
    }

    @Override
    public int calculateRewordsPoint(double cost) {
        return (int) (cost*15);
    }
}
