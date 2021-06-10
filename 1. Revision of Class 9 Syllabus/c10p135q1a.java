package class10.chapter1;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p135q1a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int nu=1;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            int f=1;
            for(int j=i;j>=1;j--)
            {
                f=f*j;
            }
            sum=sum+(double) nu/f;
            nu=nu+2;
        }
        System.out.print("Sum ="+sum);
        sc.close();
    }   
}