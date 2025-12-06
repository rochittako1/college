import java.util.*;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{ 
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the number of total people who wants to Deposit money");
    int n= scan.nextInt();
    int i=1;
    double Fee=0.005;//processing fee
    double AIR= 0.12;// Annual Interest rate 
    double MIR=0.01;// Monthly interest rate
    double FEE;//fee amount
    double A; //Amount before additional fee 
    double FA; // final amount
    while( i<=n){
    System.out.println("Customer Number"+i);
    System.out.println("Enter the deposit amount in Rs");
    double P=scan.nextDouble();
    if (P>=1000){
    System.out.println("Enter how many years have it been since you kept your money");
    int years=scan.nextInt();
    if (years<=5){
    System.out.println("Enter how many months have it been since you kept your money.");
    int month=scan.nextInt();
    if(month<12){
    A=P+0.12 *P * years + 0.01*P * month;
    System.out.println("Your maturity amount is:"+"\u20B9"+A);
    FEE=Fee*A;
    System.out.println("Your Fee amount is:"+"\u20B9"+FEE);
    FA=FEE+A;
    System.out.println("Your Final amount is:"+"\u20B9"+FA);
    }
    else{
    System.out.println("Enter month less than 12");
    }
    }
    else{
    System.out.println("Our bank only keep fixed deposit of maximum of 5 years");
    }
    }else{
    System.out.println("Our bank has minimum deposit of Rs 1000");
    }
    i++;
    }
    }
}