package Workshop8;


/**
 * Write a description of class EmplloyeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary {
    private double basicSalary;

    public EmployeeSalary(double salary) {
        this.basicSalary = salary;
    }

    public void setBasicSalary(double salary) {
        this.basicSalary = salary;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary + (0.02 * basicSalary);
    }
}