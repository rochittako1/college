package Week7;
    

public class Student
{
    // attributes or properties
    String collegeId;
    int age;
    String course;
    
    //void means null
    //constructor
    public Student(String Id,int age,String course)
    {
        this.collegeId=Id;
        this.age=age;
        this.course=course;    
    }
    
    //behaviours or methods
    void study()
    {
        System.out.println(collegeId+ "is studing.");
    }
    void laugh()
    {
        System.out.println(collegeId+ "is laughing");
    }
}
