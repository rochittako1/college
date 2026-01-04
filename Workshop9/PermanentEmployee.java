package Workshop9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee {
    double HRA;
    double DA;
    public PermanentEmployee(int employeeId, String name, double basicSalary, double HRA, double DA) {
        super(employeeId, name, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }

    // Method to calculate total salary (basicSalary + HRA + DA + bonus)
    public double calculateTotalSalary() {
        return basicSalary + HRA + DA + calculateBonus();
    }
}