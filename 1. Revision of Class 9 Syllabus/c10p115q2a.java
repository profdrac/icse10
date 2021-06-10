package class10.chapter1;
/**
 * WAP to find sum of fibo upto a range
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p115q2a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int a=0,b=1,c=0,sum=1;
        while(c<n)
        {
             c=a+b;
             if(c>n)
                break;
             sum=sum+c;
             a=b;
             b=c;
        }
        System.out.print("Sum = "+sum);
        sc.close();
    }   
}