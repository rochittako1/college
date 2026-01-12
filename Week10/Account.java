package Week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account {
    private String accountNo;
    private String holderName;
    private double balance;

    public Account(String accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNo() 
    {
        return accountNo; 
    }
    public void setAccountNo(String accountNo)
    {
        this.accountNo = accountNo;
    }
    public String getHolderName() {
        return holderName; 
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName; 
    }
    public double getBalance() { 
        return balance; 
    }
    public void setBalance(double balance) {
        this.balance = balance; 
    }
    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", holderName=" + holderName + ", balance=" + balance + "]";
    }
    public double calculateInterest() {
        return balance;
    }
}