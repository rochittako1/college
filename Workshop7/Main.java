package Workshop7;
import java.util.Scanner;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[]args)
{   Book b1=new Book();
    b1.title="Mahabharat";
    b1.author="Ram";
    b1.price=200;
    System.out.println(b1.title);
    System.out.println(b1.author);
    System.out.println(b1.price);
    
    Book b2=new Book();
    b2.title="Java";
    b2.author="Harry";
    b2.price=100;
    System.out.println(b2.title);
    System.out.println(b2.author);
    System.out.println(b2.price);
    
    Rectangle a1= new Rectangle();
    a1.length=12;
    a1.breadth=13;
    a1.area=12*13;
    System.out.println(a1.length);
    System.out.println(a1.breadth);
    System.out.println(a1.area);
    
    Rectangle a2= new Rectangle();
    a2.length=20;
    a2.breadth=30;
    a2.area=20*30;
    System.out.println(a2.length);
    System.out.println(a2.breadth);
    System.out.println(a2.area);
    
    Employee e1=new Employee();
    e1.EmployeeId=2928;
    e1.name="Hari";
    e1.salary=100000;
    
    System.out.println(e1.EmployeeId);
    System.out.println(e1.name);
    System.out.println(e1.salary);
    
    Employee e2=new Employee();
    e2.EmployeeId=2929;
    e1.name="Ramesh";
    e1.salary=120000;
    
    System.out.println(e2.EmployeeId);
    System.out.println(e2.name);
    System.out.println(e2.salary);
    
    Employee e3=new Employee();
    e3.EmployeeId=2927;
    e1.name="Sita";
    e1.salary=90000;
    
    System.out.println(e3.EmployeeId);
    System.out.println(e3.name);
    System.out.println(e3.salary);
    if (e1.salary>e2.salary && e1.salary>e3.salary){
    System.out.println(e1.name+"has the highest salary of"+e1.salary);
    }
    else if (e2.salary>e1.salary && e2.salary>e3.salary){
    System.out.println(e2.name+"has the highest salary of"+e2.salary);
    }
    else{
    System.out.println(e3.name+"has the highest salary of"+e3.salary);
    }
    Laptop l1= new Laptop("mac",8,120000);
    
    Laptop l2=new Laptop("acer",16,100000);

    Laptop l3=new Laptop("lenovo",16,110000);
    
    System.out.println("Laptop with ram greater than 8 gb are");
    if (l1.ram>8){
    System.out.println("Brand:"+ l1.brand +", RAM:"+l1.ram + "gb, Price: " +l1.price);
    }
    else if (l2.ram>8){
    System.out.println("Brand:"+ l2.brand +", RAM:"+l2.ram + "gb, Price: " +l2.price);
    }
    else if (l3.ram>8){
    System.out.println("Brand:"+ l3.brand +", RAM:"+l3.ram + "gb, Price: " +l3.price);
    }
    else  {
    System.out.println("There is not any laptop which have 8 gb ram or higher");
    }
    
    mobile m1=new mobile("apple",100000);
    mobile m2=new mobile("oneplus",60000);
    if (m1.price<20000){
    System.out.println("is affordable");
    }
    else if (m2.price<20000){
    System.out.println("is affordable");
    }
    else{
    System.out.println("isn't affordable");
    }
    Result r1=new Result();
    r1.sub1=89;
    r1.sub2=90;
    r1.sub3=78;
    r1.sub=89+90+78;
    r1.percentage=(89+90+78)/3;
    System.out.println(r1.sub1);
    System.out.println(r1.sub2);
    System.out.println(r1.sub3);
    System.out.println("Total sum:"+r1.sub);
    System.out.println("Percetange is"+r1.percentage);
    
    Result r2=new Result();
    r2.sub1=67;
    r2.sub2=87;
    r2.sub3=59;
    r2.sub=67+87+59;
    r2.percentage=(67+87+59)/3;
    System.out.println(r2.sub1);
    System.out.println(r2.sub2);
    System.out.println(r2.sub3);
    System.out.println("Total sum :"+r2.sub);
    System.out.println("Percetange is"+r2.percentage);
    
    BankAccount B1=new BankAccount(1234,"Shyam",900000);
    BankAccount B2=new BankAccount(1234,"Gita",800000);
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the amount to deposit in account 1");
    double deposit=scan.nextDouble();
    
    if(deposit>0){
    B1.balance+=deposit;
    System.out.println("Amout after deposit"+B1.balance);
    }
    else {
    System.out.println("You cannot deposit in negative value");
    }
    System.out.println("Enter the amount to withdraw in account 1");
    double withdraw=scan.nextDouble();
    if(withdraw>0 && withdraw<B1.balance){
    B1.balance-=withdraw;
    System.out.println("Fianl balance of account 1 is:"+B1.balance);
    }
    else{
    System.out.println("You cannot withdraw in negative value or more than amount in your account");
    }
    System.out.println("Enter the amount to deposit in account 2");
    double deposit1=scan.nextDouble();
    
    if(deposit1>0){
    B2.balance+=deposit;
    System.out.println("Amout after deposit"+B2.balance);
    }
    else {
    System.out.println("You cannot deposit in negative value");
    }
    System.out.println("Enter the amount to withdraw in account 2");
    double withdraw1=scan.nextDouble();
    if(withdraw1>0 && withdraw<B2.balance){
    B2.balance-=withdraw;
    System.out.println("Fianl balance of account 2 is:"+B2.balance);
    }
    else{
    System.out.println("You cannot withdraw in negative value or more than amount in your account");
    }
}
}

