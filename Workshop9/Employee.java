package Workshop9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Employee {
    int employeeId;
    String name;
    double basicSalary;
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double calculateBonus() {
        return 0.10 * basicSalary;
    }
    public void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name:" + name);
        System.out.println("Basic Salary: Rs" + basicSalary);
    }
}
