package de.telran.accounts;

public class DiamondCheckingAccount extends CheckingAccount{
    public DiamondCheckingAccount(double balance, double interestRate, int rewordsPoint) {
        super(balance, interestRate, rewordsPoint);
    }

    @Override
    public int calculateRewordsPoint(double cost) {
       int  rewards =0;
       if(cost>500){
           rewards += (int) ((cost-500)*20);
           cost=500;
       } if(cost>100){
            rewards += (int) ((cost-100)*15);
            cost=100;
        }
       rewards+= (int) (cost*10);
       return rewards;
    }
}
