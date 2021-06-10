package class10.chapter5;
/**
 * WAP to --
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p311q2_method2
{
    public void Armstrong(int n)
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
            System.out.print("number is Armstrong");
        else
            System.out.print("number is not Armstrong");
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        c10p311q2_method2 o=new c10p311q2_method2();
        System.out.print("Enter no to be checked:");
        int n=sc.nextInt();
        o.Armstrong(n);
        sc.close();
    }   
}