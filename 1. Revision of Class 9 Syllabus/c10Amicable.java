package class10.chapter1;
/**
 * WAP to check whether two numbers are amicable-pair or not [220,284]
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Amicable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt(); //220
        int b=sc.nextInt(); //284
        int sfa=0,sfb=0;
        for(int i=1;i<Math.max(a,b);i++)
        {
            if(i<a && a%i==0)
                sfa=sfa+i;
            if(i<b && b%i==0)
                sfb=sfb+i;
        }
        if(sfa==b && sfb==a)
            System.out.print("Amicable pair");
        else
            System.out.print("Not Amicable pair");
        sc.close();
    }   
}