import java.util.Scanner;

/**
 * Write a description of class Checker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checker
{
    public static void mian(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter GPA");
        float gpa=scan.nextFloat();
        System.out.println("Enter attendance");
        int attendance=scan.nextInt();
        System.out.println("Enter attitude");
        int attitude=scan.nextInt();
        if (gpa>=3.2 && gpa==4){
        if(attendance>80){
        if(attitude<5){
        System.out.println("Eligible for a scholarship");
        }
        else{
        System.out.println("Not eligible for a scholarship because of agressiveness");
        }
        }
        else {
        System.out.println("Not eligible for a scholarship because of attendance");}
        }    
        else {
        System.out.println("Not eligible for a scholarship because of GPA");}
        
    
    
    }
}