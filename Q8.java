import java.util.Scanner;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args){
    Scanner scan=new Scanner (System.in);
    System.out.println("Enter the number which you want the multipication table");
    int a= scan.nextInt();
    int b;
    for(int i=1;i<=10;i++){
    b=a*i;
    System.out.println("Multipication table is listed below\n"+b);
    }
}
}