package Week10;


/**
 * Write a description of class orderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {
    public static void main(String[] args) {
        
        normalOrder normalOrder = new normalOrder(123, "Ram", 200.00);
        System.out.println("Normal Order ");
        System.out.println(normalOrder.toString());
        System.out.println("Final Amount: " + normalOrder.finalAmount());
        
        premiumOrder premiumOrder = new premiumOrder(456, "Hari", 500.00);
        System.out.println("Premium Order");
        System.out.println(premiumOrder.toString());
        System.out.println("Final Amount: " + premiumOrder.finalAmount());

        double discountAmount = 50.00;
        System.out.println("Premium Order ");
        System.out.println(premiumOrder.toString());
        System.out.println("Final Amount ( Discount amount " + discountAmount + "): " + premiumOrder.finalAmount(discountAmount));
    }
}