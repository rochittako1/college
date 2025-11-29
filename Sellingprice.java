import java.util.Scanner;

/**
 * Write a description of class Sellingprice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sellingprice
{public static void main(String[] args){
Scanner scan=new Scanner (System.in);
System.out.println("Enter marked price");
float MP=scan.nextFloat();
float sp;
System.out.println("Enter which category cloth do you want");
char category=scan.next().charAt(0);
if (category=='a'){
sp=MP-MP*0.6f;   
System.out.println("Selling price of a is"+sp);
}
else if (category=='b'){
sp=MP-MP*0.4f;   
System.out.println("Selling price of b is"+sp);
}
else if (category=='c'){
sp=MP-MP*0.2f;   
System.out.println("Selling price of c is"+sp);}

else if (category=='d'){
sp=MP-MP*0.1f;   
System.out.println("Selling price of d is"+sp);
}

}
}