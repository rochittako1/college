
/**
 * Operators and Variables
 * @author Rochit Tako
 * @version v1.0
 */
public class HelloWorld
{
    
    int c= 9; // instance variable
    int d=98; // string variable
    
    
    
    
    
    public static void main(String[] args){
        int num3; // assiniging the variable
        
        
        int h=1;
        // ++h --> pre increment
        //h++ --> post increment
        System.out.println(h); //h=1
        System.out.println(++h); // ++h=2, h=2
        System.out.println(h); //h=2
        
        System.out.println(h++); // h=3, h++=2
        System.out.println(h); // h=3
         int j = h++;
         int k = ++h;
         System.out.println(j);
         System.out.println(h);
        /*
        int a=10;
        int b=20;
        
        int sum = a+b;
        int dif=a-b;
        int prod=a*b;
        int div=a/b;
        
        System.out.println("Sum is :"+sum);
        System.out.println("Dif is :"+dif);
        System.out.println("Prod is :"+prod);
        System.out.println("Div is :"+div);
        */
        
        int num1= 10;
        int num2=20;
        System.out.println(num1 ==num2);//false
        System.out.println(num1 !=num2);//true
        System.out.println(num1 <num2);//true
        System.out.println(num1 >num2);//false
        System.out.println(num1 >=num2);//false
        System.out.println(num1 <=num2);//true
        
        
        
        
    
    }
}