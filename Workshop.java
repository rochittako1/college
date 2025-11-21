import java.util.Scanner;

/**
 * Write a description of class Workshop here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class Workshop
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);//Take input
    System.out.println("enter first number:");
    int firstnum= scan.nextInt();//For whole numbers.
    /*
    double Secondnum= scan.nextDouble();// For decimal values
    
    scan.nextLine();//resolve buffer issue 
    
    System.out.println("Ask for his/her name:");
    
    String name= scan.nextLine();//buffer issue
    
    System.out.println ("My first number is:"+ firstnum);
    System.out.println ("My Second number is:"+ Secondnum);
    System.out.println ("Your name is:"+ name);
    //Ternery Operator
    int age=18;
    String canDrive=(age>=18)?"driving is allowed":"driving isn't allowed";
    System.out.println(canDrive);
    */
    String canDrive=(firstnum>=18)?"driving is allowed":"driving isn't allowed";
    System.out.println(canDrive);
   
}
    
}