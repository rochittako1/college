package Week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", "Ram Stha", 100000);
        CurrentAccount ca = new CurrentAccount("CA456", "Hari Thapa", 2000000);

        System.out.println(sa.toString());
        System.out.println("Savings Interest (default): " + sa.calculateInterest());
        System.out.println("Savings Interest (custom rate 5%): " + sa.calculateInterest(5));
        
        System.out.println(ca.toString());
        System.out.println("Current Interest: " + ca.calculateInterest());
    }
}