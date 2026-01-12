package Week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id,String name, String shift, int extraAllowance)
    {
        super(id,name);
        this.shift=shift;
        this.extraAllowance=extraAllowance;
    } 
    
    public double getExtraAllowance()
    {
        return this.extraAllowance;
        
    }
    @Override
    public double calculateSalary()
    {
        double baseFee=super.calculateSalary();
        double normalFee=baseFee+(this.extraAllowance*30);
        return normalFee;
    }
    
    public void displayNurseDetails()
    {
        super.displayDetails();
        System.out.println("Shift "+shift);
        System.out.println("Extra Allowance"+extraAllowance);
    }
    @Override
    public String toString(){
        return super.toString()+",shift:"+this.shift;
    }
    public void setshift(String shift)
    {
        this.shift=shift;
    }
    public String getShift()
    {
        return this.shift;
    }
    public void setextraAllowance(double extraAllowance)
    {
        this.extraAllowance=extraAllowance;
    }
    public double getextraAllowance()
    {
        return this.extraAllowance;
    }
}