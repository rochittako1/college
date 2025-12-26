package Workshop8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 999.99, 1);

        cart.displayCart();

        cart.setQuantity(2);
        System.out.println("Updated quantity: " + cart.getQuantity());

        double discountPercent = 10.0;
        double discountedTotal = cart.calculateDiscountedTotal(discountPercent);
        System.out.println("Total after " + discountPercent + "% discount: $" + discountedTotal);

        cart.displayCart();
    }
}