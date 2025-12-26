package Week8;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[] args)
    {
        //
        Calculator calc = new Calculator();
        calc.displayInfo(); //void +no params
        calc.add(10,20); // actual params
        calc.add(80,90);
        
        
        
        System.out.println(calc.getFixedNumber());
        int fixednumber=calc.getFixedNumber();
        
        System.out.println("The fix number is:" +fixednumber);
    
        int mul=calc.multiply(20,30);
        System.out.println("The multipication of number is:"+mul);
        
        //
        Calculator.square(12);
    }
}