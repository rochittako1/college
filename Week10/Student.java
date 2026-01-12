package Week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private double marks;
    public Student(int rollNo,String name,double marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    public int getrollNo()
    {
        return rollNo;
    }
    public void setrollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }
    public String getName()
    {
        return name;
    }
       public void setName(String name)
    {
        this.name=name;
    }
    public double getmarks()
    {
        return marks;
    }
       public void setmarks(double marks)
    {
        this.marks=marks;
    }

    @Override
    public String toString(){
        return ("rollNo"+rollNo+",name"+name+",Marks"+marks);
    }
    public String calculateResult()
    {
        if (this.marks>=40)
        {return "pass";
    
        }
        else if(this.marks<40&&this.marks>35)
        {
            return "GraceMarks";
        }
        else 
        {
            return "Fail";
        }
    }
}