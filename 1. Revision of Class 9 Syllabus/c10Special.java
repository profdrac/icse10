package class10.chapter1;
/**
 * WAP to check whether a number is special or not e.g. 145
 * 1 + 4x3x2x1 + 5x4x3x2x1 == 145
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Special
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int sum=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            //--find factorial and add
            int f=1;
            for(int i=rem;i>1;i--)
                f=f*i;
            sum=sum+f;
            //-------------------------
            n=n/10;
        }
        if(sum==temp)
            System.out.print("Special no");
        else
            System.out.print("!Special no");
        sc.close();
    }   
}