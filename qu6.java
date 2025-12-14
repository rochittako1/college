
/**
 * Write a description of class qu6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qu6
{
    public static void main(String[] args){
        int[][] student={{80,75},{90,85}};    
        String[] subject={"English","Nepali"};
        System.out.println("");
        System.out.println("Students\t");
        for(int i=0;i<subject.length;i++){
        System.out.println("\t"+subject[i]);
        }
        System.out.println("");
        for(int i=0;i<student.length;i++){
        System.out.println("student."+(i+1));
        for(int j=0;j<student[i].length;j++){
        System.out.println("\t"+student[i][j]);
        }
        }
    }
}