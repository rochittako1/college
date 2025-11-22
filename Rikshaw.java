import java.util.Scanner;

/**
 * Write a description of class Rikshaw here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class Rikshaw
{public static void main (String[] args){
    Scanner scan=new Scanner (System.in);
    
    double bfare=250;
    double discount=0.10;//10%discount for locals
    double surcharge=0.13;//13%extra for night rides
    
    System.out.println("Enter the travelled distance in km: ");
    double distance=scan.nextDouble();
    
    System.out.println("Enter the time taken to reach the destination in minute:");
    double time_taken=scan.nextDouble();
    double a=distance*8; //the charge of 1 km is rs8
    double b=time_taken*2;//the charge of every minute is rs2
    double fare=a+b+bfare;
    
    System.out.println("Enter the time when ride started in 24 hours system");
    double t=scan.nextDouble();
    double SAmount=(t>=20)? (fare*surcharge):0.0;
    
    System.out.println("Enter 1 if you are local if not enter 0");
    int local=scan.nextInt();
    double DAmount= (local==1 && distance>25)? (fare*discount):0.0;
    double total_amount= fare+SAmount-DAmount;
    
    System.out.println("fare of your ride=" +"\u20B9"+total_amount);


}
    
}
