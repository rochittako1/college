package Workshop8;


/**
 * Write a description of class MainEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainEmployee
{
    public static void main(String[] args)
    {
        EmployeeSalary e1 = new EmployeeSalary(288288);

        System.out.println("Basic Salary: " + e1.getbasicSalary());

        System.out.println("The gross salary is:");
        System.out.println(e1.calculateGrossSalary());
    }
}