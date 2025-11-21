import java.util.Scanner;

/**
 * Write a description of class largest here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class largest
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number:");
    int firstnum= scan.nextInt();
        System.out.println("enter second number:");
    int Secondnum= scan.nextInt();
     System.out.println("enter third number:");
    int Thirdnum= scan.nextInt();
        System.out.println ("My first number is:"+ firstnum);
        System.out.println ("My Second number is:"+ secondnum);
        System.out.println ("My third number is:"+ thirdnum);
        String  Largest=(firstnum>secondnum && firstnum>thirdnum)?:(secondnum>firstnum && secondnum>thirdnum);





    }
}