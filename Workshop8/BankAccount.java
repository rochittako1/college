package Workshop8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int AccountNumber;
    private double Balance;
    private String Name;    
    public BankAccount(int AccountNumber,double Balance,String Name)
    {
    this.AccountNumber=AccountNumber;
    this.Balance=Balance;
    this.Name=Name;
    }
    public void setBalance()
    {
    this.Balance=Balance;
    }
    public double getBalance()
    {
    return this.Balance;
    }
    public void deposit(double amount)
    {
    this.Balance=this.Balance+amount;
    System.out.println("Amount after depsit:"+this.Balance);
    }
    public boolean withdraw(double amount){
    if(amount<this.Balance)
    {
        System.out.println("Withdrawal is succesful");    
        return true;
    
    }
    else
    {
    System.out.println("Insufficient balance");
    return false;
    }
    }
    
}