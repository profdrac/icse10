package class10.chapter1;
/**
 * WAP to to check whether given no is Armstrong or not
 * 153 = 1^3+5^3+3^3 == 153
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        int sum=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            //-------------------
            sum=sum+rem*rem*rem;
            //-------------------
            n=n/10;
        }
        if(temp==sum)
            System.out.print("Armstrong");
        else
            System.out.print("!Armstrong");
        sc.close();
    }   
}