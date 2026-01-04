package Workshop9;


/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args){
    bike bike1 = new bike(102, "Honda", 95000, "160cc");
    car car1 = new car(202, "Hyundai", 900000, 4, "Diesel");
    System.out.println("Car 1 ");
    car1.displayVehicleinfo();
    System.out.println("\nTax = " + car1.calculateTax());
    System.out.println("Final Price = " + car1.calculateFinalPrice());
    System.out.println();
    System.out.println("Bike 1 ");
    bike1.displayvehicleinfo();
    System.out.println("\nTax = " + bike1.calculateTax());
    System.out.println("Final Price = " + bike1.calculateFinalPrice());
    System.out.println();

    }
}