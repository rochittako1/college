
/**
 * Write a description of class MiniBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{
    public static void main(String[] args){
    String[] categories={"Fiction","Nepali"};
    String[][] titles=new String [2][1];
    double[][] price=new double [2][1];
    titles[0][0]="Avatar";
    price[0][0]=900.15;
    titles[1][0]="Asahamati-5";
    price[1][0]=750.00;
    for (int i=0;i<categories.length;i++){
    System.out.println("Category: " + categories[i]);

    System.out.println("Title: " + titles[i][0]);
    System.out.printf("Price:%.2f%n%n", price[i][0]);
    }
    }
}
