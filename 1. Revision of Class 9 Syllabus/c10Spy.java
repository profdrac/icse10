package class10.chapter1;
/**
 * WAP to check whether a no is spy or not
 * 1124 -> 1+1+2+4 =8 == 1x1x2x4
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Spy
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int sum=0,pro=1;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        if(sum==pro)
        System.out.println("Spy");
        else
        System.out.println("!Spy");
        sc.close();
    }   
}