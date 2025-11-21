import java.util.*;

/**
 * Write a description of class Aausadipasal here.
 *
 * @author Rochit Tako
 * @version v1
 */
public class Aausadipasal
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter medicine name");
    String medicinename=scan.nextLine();
    System.out.println("Enter medicine information");
    String medicineinfo=scan.nextLine();
    double price= scan.nextDouble();
    int remain= scan.nextInt();
    scan.nextLine();
    
    System.out.println("Required medicine name:"+medicinename);
    System.out.println("Required medicine information:"+medicineinfo);
    System.out.println("Price of medicine per tablet:"+price);
    System.out.println("Quantity of medicine in stock:"+remain);
    
        
        
        
        
        
    }
    
    
}