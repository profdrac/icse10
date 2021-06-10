package class10.chapter5;
/**
 * WAP to --
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p311q2
{
    public int Armstrong(int n)
    {
        int sum=0;
        int t=n;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(t==sum)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        c10p311q2 o=new c10p311q2();
        System.out.print("Enter no to be checked:");
        int n=sc.nextInt();
        int result=o.Armstrong(n);
        if(result==1)
            System.out.print("is Armstrong");
        else
            System.out.print("is !Armstrong");
        sc.close();
    }   
}