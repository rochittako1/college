import java.util.Scanner;

/**
 * Write a description of class qu3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qu3
{
    public static void main(String[] args){
    String[] students={"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
    for (int i=0;i<5;i++)
    {
    System.out.println(students[i]);
    }
    System.out.println(students[2]);
    students[4]="Rochit";
    System.out.println(students[4]);
    Scanner scan =new Scanner (System.in);
    System.out.println("Enter how many records that you want");
    int a=scan.nextInt();
    int[] ar= new int[a];
    for (int i=0;i<ar.length;i++){
    System.out.println("Enter the new names of Student"+i);
    int names=scan.nextInt();
    ar[i]=names;
    }

    for(int i=0;i<ar.length; i++){
    System.out.println(ar[i]);
    }
    } 
}