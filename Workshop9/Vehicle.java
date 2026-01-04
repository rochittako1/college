package Workshop9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
    {
    int vehicleId;
    String brand;
    double BasePrice;
    public Vehicle(int Id,String brand,double BasePrice){
        this.vehicleId=Id;
        this.brand=brand;
        this.BasePrice=BasePrice;   
    }
    public void displayinfo(){
    System.out.printf("ID=" +vehicleId, "brand=" +brand, "BasePrice="+BasePrice);
    }
    public double calculateTax(){
        return 0.1*BasePrice;
    }
    }