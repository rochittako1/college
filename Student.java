import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class Student
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
        String name=scan.nextLine();
        
        int StudentAge=scan.nextInt();
        Double GPA=scan.nextDouble();
        System.out.println("Ask his/her name");
        System.out.println("Student's Age:");
        
        
        System.out.println("Student's name is:"+name);
        System.out.println("Student's Age:"+StudentAge);
        System.out.println("Student's GPA:"+GPA);
        
        
        
        
        
        
    }
    
}