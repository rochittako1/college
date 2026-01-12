package Week10;


/**
 * Write a description of class premiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class premiumOrder extends Order
{
    public premiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }
    @Override
    public double finalAmount(double discountAmount)
    {
        return super.finalAmount()-discountAmount;
    }
}