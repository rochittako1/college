import java.util.Scanner;

/**
 * Write a description of class qu4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qu4
{
    public static void main(String[] args){
    int[] values={10,20,30,40,50};
    int sum=0;
    int avg=0;
    int high=values[0];
    int low=values[0];
    for (int i=0;i<values.length;i++){
    System.out.println(values[i]);
    sum=sum+values[i];
    avg=sum/values.length;
    if (values[i]>high){
    high=values[i];        
    }
    if (values[i]<low){
    low=values[i];     
    }    
    }    
    System.out.println("The sum of scores of 5 students is:"+sum);
    System.out.println("The average of scores of 5 students is:"+avg);
    System.out.println("Highest number between all these number is:"+high);
    System.out.println("Lowest number between all these number is:"+low);  
    Scanner scan= new Scanner (System.in);
    System.out.println("Enter how many records that you want");
    int a=scan.nextInt();
    int[] ar= new int[a];
    for (int i=0;i<ar.length;i++){
    System.out.println("Enter the marks"+i);
    int marks=scan.nextInt();
    ar[i]=marks;
    
    }

    for(int i=0;i<ar.length; i++){
    System.out.println(ar[i]);
}
}
}   
