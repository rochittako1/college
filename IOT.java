import java.util.Scanner;

/**
 * Write a description of class IOT here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class IOT
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int Waterlevel= scan.nextInt();
    System.out.println ("Water level is:"+ Waterlevel);
    String  canDrive=(Waterlevel>=1000)? "WARNING : Water level has reached 1000L or more!":"Status:Normal";
    
    System.out.println(canDrive);
    
    }
    
    
    
}