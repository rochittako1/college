package Week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account {
    private static final double SAVINGS_INTEREST_RATE = 0.12;

    public SavingsAccount(String accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        double interest = super.calculateInterest() + getBalance() * SAVINGS_INTEREST_RATE;
        return 0.12;
    }
    public double calculateInterest(double rate) {
        double interest = getBalance() * rate;
        return 0.12;
    }
}