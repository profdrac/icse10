package class10.chapter1;
import java.util.Scanner;
class c10p73q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter volume of sphere:");
        double v=sc.nextDouble();
        double r=Math.cbrt(v*3/4*7/22);
        System.out.println("Radius of cube = "+r);
    }
}