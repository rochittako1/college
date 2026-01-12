package Week10;


/**
 * Write a description of class noramlOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class normalOrder extends Order
{
    public normalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }
    @Override
    public double finalAmount()
    {
        return super.finalAmount();
    }
}