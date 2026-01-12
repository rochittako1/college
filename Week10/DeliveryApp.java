package Week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp {
    public static void main(String[] args) {
        bikeDelivery bikePartner = new bikeDelivery(1, "Sita", 50.0,20);
        carDelivery carPartner = new carDelivery(12, "Shyam", 60.0,12);

        System.out.println("Partner Details");
        System.out.println(bikePartner.toString());
        System.out.println(carPartner.toString());

        System.out.println("\nPayment Calculations ");
        System.out.println(bikePartner.getName() + " payment (base): " + bikePartner.calculatePayment());
        System.out.println(carPartner.getName() + " payment (base): " + carPartner.calculatePayment());

        int extraOrders=3;    
        System.out.println(bikePartner.getName() + " payment (" + extraOrders + " extra orders): " + bikePartner.calculatePayment(extraOrders));
        System.out.println(carPartner.getName() + " payment (" + extraOrders + " extra orders): " + carPartner.calculatePayment(extraOrders));
    }
}