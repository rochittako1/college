import java.util.Scanner;

/**
 * Write a description of class Conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversion
{public static void main(String[] args){
Scanner scan=new Scanner (System.in);
System.out.println("Enter your GPA");
float gpa= scan.nextFloat();
if(gpa<=4.00 && gpa>0.00){
if(gpa<=4 && gpa>3.2){
System.out.println("Your grade is A");}
else if(gpa<=3.2 && gpa>2.8){
System.out.println("Your grade is B");
}
else if(gpa<=2.8 && gpa>2.4){
System.out.println("Your grade is C");
}
else if(gpa<=2.4 && gpa>2.0){
System.out.println("Your grade is D");
}
else if(gpa<2.0 && gpa>0) {
System.out.println("You are fail");
}
else{
System.out.println("It is not valid GPA");
}
}
}
}