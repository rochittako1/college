package Workshop9;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber , accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        double interest = super.getBalance() * interestRate / 100;
        return interest;
    }
}