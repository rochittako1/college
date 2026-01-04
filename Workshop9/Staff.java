package Workshop9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person {
    double workingHours;
    double ratePerHour;

    public Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour) {
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    // Assuming calculateSalary is the intended method name
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}