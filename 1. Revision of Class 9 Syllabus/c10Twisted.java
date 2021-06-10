package class10.chapter1;
/**
 * WAP to check whether given no is Twisted prime or not
 * e.g. 17 & 71 both are primes
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Twisted
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int cf=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                cf++;
        }
        if(cf==2)
        {
            int rev=0;
            while(n>0)
            {
                int rem=n%10;
                rev = rev*10 + rem;
                n=n/10;
            }
            int cf2=0;
            for(int i=1;i<=rev;i++)
            {
                if(rev%i==0)
                    cf2++;
            }
            if(cf2==2)
                System.out.print("Twisted Prime");
            else
                System.out.print("!Twisted Prime");
        }
        else
            System.out.print("The number itself is not Prime");
        sc.close();
    }   
}