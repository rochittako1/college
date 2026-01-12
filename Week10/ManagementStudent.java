package Week10;


/**
 * Write a description of class ManagmentStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student
     {
    public ManagementStudent(int rollNo, String name, double marks) 
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult() + " Specific criteria for Management student applied.";
    }

    public String calculateResult(int graceMarks) {
        return "Result with grace marks for Management student: " + (getmarks() + graceMarks);
    }
}