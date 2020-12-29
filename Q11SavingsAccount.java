package assignment14;

public class Q11SavingsAccount extends Q11BankAccount {
    double interestRate;

    public Q11SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
