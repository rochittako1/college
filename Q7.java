import java.util.Scanner;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=scan.nextInt();
    System.out.println("Enter second number");
    int b= scan.nextInt();
    float calculation;
    System.out.println("Enter A for sum\nEnter B for difference\nENter Cfor multipication\nEnter D for division");
    char arthimetic=scan.next().charAt(0);
    switch (arthimetic){
    case 'A':
    calculation=a+b;
    System.out.println("The sum of two number is:"+calculation);
    break;
    case 'B':
    calculation=a-b;
    System.out.println("The difference of two number :"+calculation);
    break;
    case 'C':
    calculation=a*b;
    System.out.println("The multipication of two number :"+calculation);
    break;
    case 'D':
    calculation=a/b;
    System.out.println("The division of two number :"+calculation);
    break;
    }
}}