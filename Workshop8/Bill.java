package Workshop8;


/**
 * Write a description of class bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bill{
    public static void main(String[] args) {
        ElectricityBill b = new ElectricityBill("Ram ", 150);

        System.out.println("Consumer Name: " + b.getConsumerName());
        System.out.println("Units Consumed: " + b.getUnitsConsumed());
        System.out.println("Total Bill Amount: " + b.calculateBill());

        b.setUnitsConsumed(80);
        System.out.println("\nAfter updating units consumed to 80:");
        System.out.println("Units Consumed: " + b.getUnitsConsumed());
        System.out.println("Total Bill Amount: " + b.calculateBill());
    }
}