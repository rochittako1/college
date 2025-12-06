import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String [] args){
    Scanner scan=new Scanner (System.in);
    System.out.println("Enter the number you want to reverse");
    int a=scan.nextInt();
    int c=0;
    int b;
    while ( a>0)
    {
        b=a%10;
        c=c*10+b;
        a=a/10;
    }
    System.out.println(+c);
    }
}