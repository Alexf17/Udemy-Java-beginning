package de.telran.accounts;

public abstract class CheckingAccount extends Account {
    public int rewordsPoint;

    public CheckingAccount(double balance, double interestRate, int rewordsPoint) {
        super(balance, interestRate);
        this.rewordsPoint = rewordsPoint;
    }

    public int getRewordsPoint() {
        return rewordsPoint;
    }


    public boolean purches(double cost) {
        if (cost > balance) return false;
        balance -= cost;
        rewordsPoint += calculateRewordsPoint(cost);
        return true;
    }
    public abstract int calculateRewordsPoint(double cost) ;
}
