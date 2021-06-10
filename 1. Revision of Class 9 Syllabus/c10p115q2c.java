package class10.chapter1;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p115q2c
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i*(i+1)/2;
        }
        System.out.print("Sum of series is "+sum);
        sc.close();
    }   
}