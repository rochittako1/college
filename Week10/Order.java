package Week10;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    public Order(int orderId,String customerName,double amount)
    {
      this.orderId=orderId;
      this.customerName=customerName;
      this.amount=amount;
    }
    public void setorderId(int orderid)
    {
        this.orderId=orderId;
    }
    public int getorderId()
    {
        return this.orderId;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setamount(double amount)
    {
        this.amount=amount;
    }
    public double getamount()
    {
        return this.amount;
    }
    public double finalAmount(){
        return amount;
    }
    public double finalAmount(double discountAmount)
    {
        return amount- discountAmount;
    }
    @Override 
    public String toString()
    {
        return "Orders\n Orderid"+orderId +", Customer's Name"+customerName+", Amount"+amount;
    }
}