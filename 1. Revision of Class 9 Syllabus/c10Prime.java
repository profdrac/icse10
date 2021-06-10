package class10.chapter1;
/**
 * WAP to check whether given no is prime or composite
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is composite");
        sc.close();
    }   
}