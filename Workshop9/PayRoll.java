package Workshop9;


/**
 * Write a description of class PayRoll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayRoll
{
    public static void main(String[] args) {
        PermanentEmployee PE = new PermanentEmployee(101, "Ram", 50000, 10000, 5000);
        System.out.println("Permanent Employee Details ");
        PE.displayEmployee();
        System.out.println("Total Salary: Rs" + PE.calculateTotalSalary());
        System.out.println();
        ContractEmployee CE = new ContractEmployee(102, "Hari" , 2000, 22);
        System.out.println("Contract Employee Details");
        CE.displayEmployee();
        System.out.println("Total Salary:Rs " + CE.calculateTotalSalary());
    }
}