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
    private double grossSalary;

    public EmployeeSalary(double salary)
    {
        this.basicSalary = salary;
    }

    public void setbasicSalary(double salary)
    {
        this.basicSalary = salary;
    }

    public double getbasicSalary()
    {
        return this.basicSalary;
    }

    public double calculateGrossSalary()
    {
        grossSalary = (0.02 * basicSalary) + basicSalary;
        return grossSalary;
    }
}
