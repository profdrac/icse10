package class10.chapter1;
/**
 * WAP to to check whether given no is Neon or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Neon
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        int sum=0;
        int sq=n*n;
        while(sq>0)
        {
            int rem=sq%10;
            sum+=rem;
            sq/=10;
        }
        if(sum==n)
            System.out.print("Neon");
        else
            System.out.print("!Neon");
        sc.close();
    }   
}