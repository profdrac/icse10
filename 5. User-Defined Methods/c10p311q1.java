package class10.chapter5;
/**
 * WAP to show amount after disc. using fun-over
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p311q1
{
    
    public void Discount(int a, int pp)
    {
        int dis= pp*a/100;
        System.out.println("with one discountYou have to pay Rs."+(pp-dis));
    }
    
    public void Discount(int a, int b, int pp)
    {
        int d1=pp*a/100;
        int amt=pp-d1;
        int d2=amt*b/100;
        System.out.println("with 2 discounts You have to pay Rs."+(amt-d2));
    }
    
    public void Discount(int a, int b, int c, int pp)
    {
        int d1=pp*a/100;
        int amt=pp-d1;
        int d2=amt*b/100;
        amt = amt -d2;
        int d3=amt*c/100;
        System.out.println("with 3 discounts You have to pay Rs."+(amt-d3));
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p311q1 o=new c10p311q1();
        System.out.print("Enter printed price:");
        int pp=sc.nextInt();
        System.out.println("Enter rates of discounts:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        o.Discount(a, pp);
        o.Discount(a, b, pp);
        o.Discount(a, b, c, pp);
        sc.close();
    }   
}