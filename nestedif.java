import java.util.Scanner;

/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{public static void main(String[] args){
Scanner scan=new Scanner (System.in);
System.out.println("Enter the number");
int a=scan.nextInt();
if (a %3==0){

if (a%5==0){
System.out.println("it is divisible by 3 and 5" );
}
else {
System.out.println("it is divisible by 3");}
}
else if (a%5==0){
System.out.println("It is divisible by 5");
}
else{
System.out.println("It isnot divisible by 3 and 5 both");
}
}
}