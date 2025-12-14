
/**
 * Write a description of class qu7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qu7
{
    public static void main(String[] args){
    String[][] seat={{"Ram",""},{"Hari",""},{"Sita",""}};
    for(int i=0;i<seat.length;i++){
    for (int j=0;j<seat[i].length;j++){
    if (seat[i][j].isEmpty()){
    System.out.println("The seat is empty");
    }
    else{
    System.out.println(seat[i][j]);
    }
    }
    System.out.println();
    }
    }
}