package class10.chapter1;
/**
 * WAP to find factorial of a given no
 * e.g. n = 5
 * factorial = 5x4x3x2x1 = 120
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int f=1;
        for(int i=n;i>1;i--)
            f=f*i;
        System.out.println("Factorial of "+n+" is "+f);
        sc.close();
    }   
}