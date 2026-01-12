package Week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bikeDelivery extends DeliveryPartner
{
    private int order;
    public bikeDelivery(int partnerId,String name,double basePay,int order)
    {
        super(partnerId,name,basePay);
        this.order=order;
    }
    @Override
    public double calculatePayment()
    {
       return super.calculatePayment();
    }
    public double calculatePayment(int extraOrder)
    {
       return super.calculatePayment()+(extraOrder*2);
    }
}