package class10.chapter1;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p115q2d
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int f=1;
            for(int j=1;j<=i;j++)
                f=f*j;
            sum=sum+f;
        }
        System.out.print("Sum of series is "+sum);
        sc.close();
    }   
}