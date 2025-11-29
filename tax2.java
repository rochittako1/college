import java.util.Scanner;

/**
 * Write a description of class tax2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tax2
{       
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your annual income");
        int income= scan.nextInt();
        double tax;
        if(income<=500000)
        {
        tax= income*0.01;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        else if (income<=700000 && income>500000)
        {
        tax= 0.01*500000 + (income-500000)*0.10;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        else if (income<=1000000 && income>700000)
        {
        tax= 0.01*500000 + 0.10*200000 + (income-700000)*0.20;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        else if (income<=2000000 && income>1000000)
        {
        tax= 0.01*500000 + 0.10*200000 + 0.20*300000 +(income-1000000)*0.20;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        else if (income<=2000000 && income>5000000)
        {
        tax= 0.01*500000 + 0.10*200000 + 0.20*300000 +0.30*1000000+(income-2000000)*0.20;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        else if (income>5000000)
        {
        tax= 0.01*500000 + 0.10*200000 + 0.20*300000 +0.30*1000000+(income-5000000)*0.20;
        System.out.println("Your taxable amount is "+"\u20B9"+tax);
        }
        
    }
}