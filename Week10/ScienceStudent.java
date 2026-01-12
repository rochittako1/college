package Week10;


/**
 * Write a description of class Management here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student {
    public ScienceStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult() + " Specific criteria for Science student applied.";
    }

    public String calculateResult(int graceMarks) {
        return "Result with grace marks for Science student: " + (getmarks() + graceMarks);
    }
}


    