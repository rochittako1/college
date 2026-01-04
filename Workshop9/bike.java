package Workshop9;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class bike extends Vehicle
{
    String EngineCapacity;
    
    public bike(int Id,String brand,double BasePrice,String EngineCapacity)
    {
    super(Id,brand,BasePrice);
    this.EngineCapacity=EngineCapacity;
    }
     void displayvehicleinfo(){
    System.out.printf("Brand= "+brand,"Base Price="+BasePrice,"EngineCapacity"+EngineCapacity);
    }
    public double calculateFinalPrice(){
        double tax=calculateTax();
        return BasePrice+tax;
    }
}