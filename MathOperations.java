import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class MathOperations
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.println("enter first number:");
    int a=scan.nextInt();
    System.out.println("enter Second number:");
    int b=scan.nextInt();
    int sum=a+b;
    int diff=a-b;
    int mul=a*b;
    int div=a/b;
    System.out.println("sum:");
    System.out.println("Diiference:");
    System.out.println("Multipication:");
    System.out.println("Dvision");
    System.out.println("post-increment",a++);
    System.out.println("Pre-increment:",++a);
    
    
    }
}