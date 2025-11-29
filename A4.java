import java.util.Scanner;

/**
 * Write a description of class A4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A4
{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the size of paper as A0, A1,A2,A3,A4,A5");
    String papersize= scanner.nextLine();
    switch (papersize)
    {
    case "A0":
    System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches)");
    break;
    case "A1":
    System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");
    break;
    case"A2":
    System.out.println("A2: 420 x 594 mm (16.5 x 23.4 inches)");
    break;
    case"A3":
    System.out.println("A3: 297 x 420 mm (11.7 x 16.5 inches)");        
    case"A4":
    System.out.println("A4: 210 x 297 mm (8.3 )");
    case"A5":
    System.out.println("A5: 148 x 210 mm (5.8)");
    default:
    System.out.println("Invalid size chossen");
    }
}
}