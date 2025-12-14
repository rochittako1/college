import java.util.Scanner;

/**
 * Write a description of class qu5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qu5
{
    public static void main(String [] args){
    String[] district={"Morang","Kathmandu","Kaski","Sindhuli"};
    for (int i=0;i<district.length;i++){
        int a=i+1;
        System.out.println(a+"."+district[i]);    
    }
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter how many records that you want");
    int a=scan.nextInt();
    scan.nextLine();
    String[] b=new String[a];
    System.out.println("Enter the district name:");
    for(int i=0;i<b.length;i++){
    System.out.println("Districts"+(i+1)+":");
    b[i]=scan.nextLine();
    
    }
    
    }
}