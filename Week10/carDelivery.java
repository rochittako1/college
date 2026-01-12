package Week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carDelivery extends DeliveryPartner

{
    private int order;
    public carDelivery(int partnerId,String name,double basePay,int order)
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
