package class10.chapter1;
/**
 * WAP to to check whether given no is Harshad or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Harshad
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
            sum+=rem;
            n/=10;
        }
        if(temp%sum==0)
            System.out.print("Harshad");
        else
            System.out.print("!Harshad");
        sc.close();
    }   
}