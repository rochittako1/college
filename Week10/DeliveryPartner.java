package Week10;


/**
 * Write a description of class deliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    public DeliveryPartner(int parnterId,String name,double basePay){
        this.partnerId=partnerId;
        this.name=name;
        this.basePay=basePay;
    }
    public int getpartnerId()
    {
        return partnerId;
    }
    public void setparnterId(int partnerId)
    {
        this.partnerId=partnerId;
    }
    public String getName()
    {
        return name;
    }
       public void setName(String name)
    {
        this.name=name;
    }
    public double getBasePay()
    {
        return basePay;
    }
       public void setBasePay(double basePay)
    {
        this.basePay=basePay;
    }
    
    public double calculatePayment()
    {
        return this.basePay;
    }
    @Override
    public String toString(){
        return ("PartnerId:"+partnerId+",name"+name+",BasePay"+basePay);
    }
}