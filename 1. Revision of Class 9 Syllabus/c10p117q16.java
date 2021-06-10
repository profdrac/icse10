package class10.chapter1;
/**
 * WAP (menu-based) to show 1. fibo upto 10-terms, 2. sum of digits
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p117q16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("[1] Fibonacci Series");
        System.out.println("[2] Sum of digits");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                int a=0,b=1,c;
                System.out.print(a+","+b+",");
                do
                {
                    c=a+b;
                    System.out.print(c+",");
                    a=b;
                    b=c;
                }while(c<34);
                break;
            case 2:
                System.out.println("Enter a no:");
                int n=sc.nextInt();
                int sum=0;
                while(n>0)
                {
                    int rem=n%10;
                    sum=sum+rem;
                    n=n/10;
                }
                System.out.println("Sum of digits is "+sum);
                break;
            default:
                System.out.println("Eye checkup?");
        }
        sc.close();
    }   
}