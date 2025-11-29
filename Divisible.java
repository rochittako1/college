import java.util.Scanner;

/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible
{public static void main(String[] args){
Scanner scan=new Scanner (System.in);
int a=scan.nextInt();
if (a%3==0 && a%5==0){
System.out.println("The given number is divisible by both 3 and 5"+a);
}
else{
System.out.println("The given number isnot divisible by 3 and 5"+a);
}
}
}