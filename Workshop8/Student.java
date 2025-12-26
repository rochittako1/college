package Workshop8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //Attributes
    private String name;
    private int id;
    private String address;
    private long pnumber;
     
    //Constructor
    public Student(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    
    //getters and setters  method (sab ma aauta aauta hunu parxa ini haru)
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setid()
    {
        this.id=id;
    }
    public int getid()
    {
        return this.id;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setpnumber()
    {
        this.pnumber=pnumber;
    }
    public long getpnumber()
    {
        return this.pnumber;
    }
    public void displayInfo()
    {
        String name=this.getName();
        int id=this.getid();
        String address=this.address;
        long pnumber=this.pnumber;
        
        System.out.println("Name of the student"+name);
        System.out.println("ID of the student is"+id);
    }
}