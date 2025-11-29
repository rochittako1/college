import java.util.Scanner;

/**
 * Write a description of class Determinationofnumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Determinationofnumber
{ public static void main (String[] args){
    Scanner scan=new Scanner (System.in);
    int a= scan.nextInt();
    if (a<0){
    System.out.println("the number is negative");
    }
    else if (a>1){
    System.out.println("the number is positive");
    }
    else{
    System.out.println("the number is 0");
}
}
}