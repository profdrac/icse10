package class10.chapter1;
/**
 * WAP to find sum of series
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p115q3a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of a and n:");
        int a=sc.nextInt();
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
            sum=sum+ (double) i/Math.pow(a,i);
        System.out.print("Sum of series is "+sum);
        sc.close();
    }   
}