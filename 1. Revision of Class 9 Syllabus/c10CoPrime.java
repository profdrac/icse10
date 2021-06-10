package class10.chapter1;
/**
 * WAP to get HCF/GCD of 2 numbers
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10CoPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        if(hcf==1)
        System.out.print("Co-Prime");
        else
        System.out.print("!Co-Prime");
        sc.close();
    }   
}