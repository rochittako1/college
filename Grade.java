import java.util.Scanner;

/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grade
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int grade=scan.nextInt();
    System.out.println("Enter your grade");
    String Grade = (grade>=40) ? "Pass": "Fail";
    System.out.println("About your exam="+Grade);
    
    
    
    
    
    
    
    }
    
    
}