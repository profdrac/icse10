package class10.chapter1;
import java.util.Scanner;
class c10p73q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        double sr=Math.sqrt(n);
        double cr=Math.cbrt(n);
        long srl=Math.round(sr);
        long crl=Math.round(cr);
        System.out.println("Square root of "+n+" = "+sr);
        System.out.println("Rounded form = "+srl);
        System.out.println("Cube root of "+n+" = "+cr);
        System.out.println("Rounded form = "+crl);
    }
}