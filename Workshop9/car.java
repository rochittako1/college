package Workshop9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class car extends Vehicle
{
    int numberOfDoors;
    String FuelType;
    
    car(int Id,String brand,double BasePrice,int numberOfDoors,String FuelType)
    {
    super(Id,brand,BasePrice);
    this.numberOfDoors=numberOfDoors;
    this.FuelType=FuelType;
    }
     void displayVehicleinfo(){
         System.out.printf("Brand="+brand,"Base Price="+BasePrice,"Number of doors="+numberOfDoors,"FuelType="+FuelType);
    }
    public double calculateFinalPrice(){
        double tax=calculateTax();
        double luxuryCharge=0.05*BasePrice;
        return BasePrice+tax+luxuryCharge;
    }
}