package Workshop9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("890123", "Gita", 1000, 5);
        CurrentAccount current = new CurrentAccount("086456", "Sita", 500, 200);

        System.out.println("Savings Account Operations");
        System.out.println("Initial Balance: $" + savings.getBalance());
        savings.deposit(200);
        System.out.println("Current Balance after deposit: $" + savings.getBalance());
        double interest = savings.calculateInterest();
        System.out.println("Calculated Interest: $" + interest);        System.out.println("\n--- Current Account Operations ---");
        System.out.println("Initial Balance: " + current.getBalance());
        current.deposit(100);
        System.out.println("Balance after deposit:" + current.getBalance());
        current.withdraw(700);
        System.out.println("Balance after 700 withdrawal: " + current.getBalance());
        current.withdraw(200); 
        System.out.println("Final Balance: " + current.getBalance());
    }
}