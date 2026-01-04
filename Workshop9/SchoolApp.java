package Workshop9;


public class SchoolApp 
{
    public static void main(String[] args) {
        Teacher teacher = new Teacher(101, "Mr. Smith", 5000, "Math", 1000);
        Staff staff = new Staff(201, "Ms. Johnson", 3000, 160, 20);

        System.out.println("Teacher Annual Salary: " + teacher.calculateAnnualSalary());
        System.out.println("Staff Salary: " + staff.calculateSalary());
        System.out.println("College Name: " + Person.collegeName);
    }
}
