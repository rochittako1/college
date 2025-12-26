package Workshop8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public ShoppingCart(String itemName,double itemPrice,int quantity)
    {
        this.itemName= itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }
    public int getQuantity(){
    return quantity;
    }
    public void setQuantity(int quantity)
    {
    this.quantity=quantity;
    }
    public double calculateTotal()
    {
    return itemPrice*quantity;
    }
    public double calculateDiscountedTotal(double dicountPercent)
    {
        double total=calculateTotal();
        double discountamount=total*0.2;
        return total-discountamount;
    }
    public void displayCart() {
        System.out.println("--- Cart Details ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotal());
        System.out.println("--------------------");
    }
}