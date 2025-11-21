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
    
    //arthmetic
    
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
    
    //Unary
    
    System.out.println("post-increment"+ a++);
    System.out.println("Pre-increment:"+ ++a);
    
    //assignment
    
    int age=19;
    
    //relational
    
    boolean greater =(a>b);
    System.out.println("a is greater than b");
    boolean smaller =(a<b);
    System.out.println("a is smaller than b");
    boolean equal = (a==b);
    System.out.println("a is equal to b");
    boolean notsame = (a!=b);
    System.out.println("a is greater than b");
    
    //logical
    
    boolean result =(a%2==0 && b%2==0);
    System.out.println("Both number are even");
    
    //ternary
    String license = (age>=18) ? "can get license": "can not get license";
    System.out.println("Inquery of license="+license);
    
    
    }
}