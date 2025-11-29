import java.util.Scanner;

/**
 * Write a description of class Switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Switch
{public static void main(String[] args){
Scanner scan=new Scanner (System.in);
System.out.println("Enter marked price");
float MP=scan.nextFloat();
float sp;
System.out.println("Enter which categerory cloth do you want");
char category=scan.next().charAt(0);
switch(category){
case 'A':
sp=MP-MP*0.6f;   
System.out.println("Selling price of a is"+sp);
break;
case 'B':
sp=MP-MP*0.4f;   
System.out.println("Selling price of b is"+sp);
break;
case 'C':
sp=MP-MP*0.2f;   
System.out.println("Selling price of c is"+sp);
break;
case 'D':
sp=MP-MP*0.1f;   
System.out.println("Selling price of d is"+sp);
break;
default:
System.out.println("Invalid category choice");
}

}
}