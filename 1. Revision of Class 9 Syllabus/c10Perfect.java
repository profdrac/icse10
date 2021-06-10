package class10.chapter1;
/**
 * WAP to check whether given no is perfect
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Perfect
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            System.out.println(n+" is perfect");
        else
            System.out.println(n+" is not perfect");
        sc.close();
    }   
}