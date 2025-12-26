package Workshop8;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main (String[] args)
    {
        Student s1=new Student("Rochit",2);
        System.out.println(s1.getName());
        System.out.println(s1.getid());
        System.out.println(s1.getAddress());
        System.out.println(s1.getpnumber());
        s1.displayInfo();
        
        s1.setName("hawa");
        System.out.println(s1.getName());
        System.out.println(s1.getid());
        s1.displayInfo();
        
    }
}