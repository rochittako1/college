import java.util.Scanner;

/**
 * Write a description of class tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tax
{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your annual income");
    int income=scan.nextInt();
    double tax;
    if (income<=500000){
    tax=income*0.01;    
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
    else if (income<=700000 && income>500000)
    {
    tax=income*0.1+5000;
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
    else if (income<=1000000 && income>700000)
    {
    tax=income*0.2+15000;
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
    else if (income<=2000000 && income>1000000)
    {
    tax=income*0.3+35000;
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
    else if (income<=2000000 && income>5000000)
    {
    tax=income*0.36+335000;
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
    else if (income>5000000)
    {
    tax=income*0.39+1135000;
    System.out.println("Your taxable amount is "+"\u20B9"+tax);
    }
}
}