
/**
 * Write a description of class Tutorial6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial6
{
    public static void main(String [] args){
    int[] age;//Declaration of aaray
    age = new int[5];//construction of an array
    
    System.out.println(age.length);//finding the length
    
    age[0]=1;
    age[1]=2;
    age[2]=3;
    age[3]=4;
    age[4]=5;
    //age[5]=6; //index out of bound
    
    System.out.println(age[1]);
    age[1]=99;
    /*
    int[] qwe={12,23,34,45,56};
    System.out.println(age.length-1);
    for(int i=0;i<5;i++){
    System.out.println(qwe[i]);
    }
    */
   for( int i=age.length;i>=0;i--){ 
   System.out.println(age[i]);
}



int[][][] matrix;
matrix= new int[2][2][2];
matrix [0][0][0]=1;
matrix [0][0][1]=2;
matrix [0][1][0]=4;
matrix [0][1][1]=5;
matrix [1][0][0]=10;
matrix [1][0][1]=3;
matrix [1][1][0]=6;
matrix [1][1][1]=7;

int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<mat.length;i++){
    for(int j=0;j< mat[i].length;j++){
    
    }
    System.out.println(i);
}

}
}
