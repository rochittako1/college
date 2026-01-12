package Week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Person p1=new Person(101,"Sandesh");
        System.out.println(p1);  
        doctor d1=new doctor(10,"Hari"," Opthamologist",6000);
        System.out.println(d1.calculateSalary());
        System.out.println(d1.calculateSalary(2));
        d1.displayDoctorDetails();
        Nurse n1=new Nurse(2,"Ram","Day",4000);
        System.out.println(n1.calculateSalary());
        n1.displayNurseDetails();
    }
}