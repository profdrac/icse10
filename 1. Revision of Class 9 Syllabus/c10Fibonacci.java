package class10.chapter1;
/**
 * WAP to print Fibonacci upto a given range
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.print(a+" "+b+" ");
        do
        {
            c=a+b;
            if(c>n)
                break;
            System.out.print(c+" ");
            a=b;
            b=c;
        }while(c<=n);
        sc.close();
    }   
}