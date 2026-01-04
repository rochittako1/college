package Workshop9;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee {
    int WorkingDays;

    public ContractEmployee(int employeeId, String name, double basicSalary, int WorkingDays) {
        super(employeeId, name, basicSalary);
        this.WorkingDays = WorkingDays;
    }
    public double calculateTotalSalary() {
        return basicSalary * WorkingDays;
    }
}