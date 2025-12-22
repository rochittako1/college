package Workshop7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int AccountNumber;
    String AccountHolderName;
    double balance;
    public BankAccount(int Number,String Name,double balance){
    this.AccountNumber=Number;
    this.AccountHolderName=Name;
    this.balance=balance;
    }
}