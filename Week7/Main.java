package Week7;


public class Main
{
    public static void main(String[] args){
    //<className> variable_name=new className();
    
    //creation of object
    Student s1= new Student("np01cp4a250060",19,"computing");
    s1.study();
    //attributes bata data carry garxa
    System.out.println(s1.collegeId);
    System.out.println(s1.age);
    System.out.println(s1.course);
    
    Student s2=new Student("np01cp4a250060",19,"computing");
    /*s2.collegeId="np01cp4s20035";
    s2.age=19;
    s2.course="computing";
    s2.laugh();*/
    System.out.println(s2.collegeId);
    System.out.println(s2.age);
    System.out.println(s2.course);
    
    Car c1= new Car();
    c1.brand="BMW";
    c1.price=999999;
    c1.model="M4";
    c1.drive();
    
    System.out.println(c1.brand);
    System.out.println(c1.price);
    System.out.println(c1.model);
    
    Car c2= new Car();
    c2.brand="Tesla";
    c2.price=8888888;
    c2.model="Model X";
    c2.brakes();
    
    System.out.println(c2.brand);
    System.out.println(c2.price);
    System.out.println(c2.model);

    }
}
