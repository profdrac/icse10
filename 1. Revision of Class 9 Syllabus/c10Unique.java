package class10.chapter1;
/**
 * WAP to check if a no is unique or not
 * e.g. 1579
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Unique
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        boolean isU=true;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            int t=n;
            while(t>0)
            {
                int d=t%10;
                if(d==rem)
                {
                    isU=false; 
                    break;
                }
                t=t/10;
            }
        }
        if(isU)
            System.out.print("Unique");
        else
            System.out.print("!Unique");
        sc.close();
    }   
}