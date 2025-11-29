import java.util.Scanner;

/**
 * Write a description of class XFC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class XFC
{
    public static void main(String[] args){
    Scanner scan=new Scanner (System.in);
    System.out.println("Enter your age group c if child or a for adult or s for senior");
    char Agroup=scan.next().charAt(0);
    int Bprice;
    double price;
    double SD;//Student discount
    double FD;//Festival discount
    double Fprice;//final price
    if (Agroup == 'c'){
    System.out.println("Enter n for neapali language h for hindi language and e for english language movie do you want to see");
    char language=scan.next().charAt(0);
    price=150;
    if (language=='n'){
    price=price;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='h'){
    price=price+50;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='e'){
    price=price+100;
    System.out.println("your movie ticket price is :"+price);
    }
    else {
    System.out.println("invalid request for movie language");}
    System.out.println("Are you booking this ticket on Festival or not?\nif you are booking on festival day type f in not type n");
    char day=scan.next().charAt(0);
     if(day=='f'){
    FD=price-price*.15;
    System.out.println("Your final amount is"+FD);
    }
    else if(day=='n'){
    FD=price;
    System.out.println("Your final amount is"+FD);}
    else {System.out.println("invalid request for festival discount");}
    System.out.println("Are you a student?\nif yes type y or no for n");
    char student=scan.next().charAt(0);
    if (student=='y'){
    SD=price-price*0.2;
    System.out.println("Your final amount is"+SD);
    }
    else {System.out.println("invalid request for student discount");
    }
    }
    
    
    else if (Agroup=='a'){
    System.out.println("Enter n for neapali language h for hindi language and e for english language movie do you want to see");
    char language=scan.next().charAt(0);
    price=250;
    if (language=='n'){
    price=price;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='h'){
    price=price+50;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='e'){
    price=price+100;
    System.out.println("your movie ticket price is :"+price);
    }
    else {
    System.out.println("invalid request for movie language");}
    System.out.println("Are you booking this ticket on Festival or not?\nif you are booking on festival day type f in not type n");
    char day=scan.next().charAt(0);
     if(day=='f'){
    FD=price-price*.15;
    System.out.println("Your final amount is"+FD);
    }
    else {System.out.println("invalid request for festival discount");
    }
    }
    
    
    else if (Agroup=='s'){
    System.out.println("Enter n for neapali language h for hindi language and e for english language movie do you want to see");
    char language=scan.next().charAt(0);
    price=200;
    if (language=='n'){
    price=price;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='h'){
    price=price+50;
    System.out.println("your movie ticket price is :"+price);
    }
    else if(language=='e'){
    price=price+100;
    System.out.println("your movie ticket price is :"+price);
    }
    else {
    System.out.println("invalid request for movie language");}
    System.out.println("Are you booking this ticket on Festival or not?\nif you are booking on festival day type f in not type n");
    char day=scan.next().charAt(0);
     if(day=='f'){
    FD=price-price*.15;
    System.out.println("Your final amount is"+FD);
    }
    else {System.out.println("invalid request for festival discount");
    }
    }
    else{
    System.out.println("invalid age group");
    }
    
    
    
}
}