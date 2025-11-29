import java.util.Scanner;

/**
 * Write a description of class OddorEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddorEven
{ public static void main (String[] args){
    Scanner scan=new Scanner (System.in);
    int a= scan.nextInt();
    if (a%2==0){
    System.out.println("the number is even");
    }
    else{
    System.out.println("the number is odd");
    
    }

}
}