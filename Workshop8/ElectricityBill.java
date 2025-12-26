package Workshop8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String ConsumerName;
    private int unitsConsumed;

    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.ConsumerName = ConsumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public String getConsumerName(){
    return ConsumerName;
    }
    
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double calculateBill() {
        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 8);
        }
        return billAmount;
    }
}