package Workshop8;


/**
 * Write a description of class EmplloyeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    private double basicSalary;
    double GrossSalary;
     public EmployeeSalary(double salary)
    {
        this.basicSalary=basicSalary;
    }
    public void setbasicSalary(double salary)
    {
        this.basicSalary=basicSalary;
    }
    public double getbasicSalary()
    {
        return this.basicSalary;
    }
    public double calculateGrossSalary(double basicSalary)
    {
    GrossSalary=(.02*basicSalary)+basicSalary;
    return GrossSalary;
    }
}