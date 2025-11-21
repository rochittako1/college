
/**
 * Write a description of class Tutorial here.
 *
 * @author Rochit Tako          
 * @version v1
 */
public class Tutorial
{
    int agr; //instance variable
    static int rtr; //static varibale
    
    public static void main (String[] args)
    {
    int age=18; //local variable
    System.out.println(age);
    //<className> <variable>=new <className>();
    Tutorial t1=new Tutorial();
    
    
    System.out.println(t1.agr);
    double db=age;
    System.out.println(db);
    short cd=12;
    byte sh=(byte)cd;
    System.out.println(sh);
    long lg=20;
    int in=(int)lg;
    System.out.println(lg);
    
    short st=10;
    short str=11;
    short sum= (short)(st+str);
    
    byte a=23;
    byte b=42;
    byte add=(byte)(a+b);
    
    //Maximum,minimum,bits,bytes
    
    System.out.println(Byte.MAX_VALUE); // maximum value
    System.out.println(Byte.MIN_VALUE); // minimum value
    System.out.println(Byte.SIZE); // bits
    System.out.println(Byte.BYTES); //bytes
    
    // Escape sequence
    
    System.out.println("Hamro\nWorld");
    System.out.println("Hamro\tWorld");
    System.out.println("She said \'hi\'");
    
    // Unicode escape sequence
    System.out.println("\u2764");
    
    
    }
    
    
    
}