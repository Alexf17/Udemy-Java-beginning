package de.telran.accounts;

public class GoldCheckingAccount extends CheckingAccount {


    public GoldCheckingAccount(double balance, double interestRate, int rewordsPoint) {
        super(balance, interestRate, rewordsPoint);
    }

    @Override
    public int calculateRewordsPoint(double cost) {
        return (int) (cost*10);
    }


}
