package class10.chapter1;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p135q1e
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n and a:");
        int n=sc.nextInt();
        int a=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            int cf=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    cf++;
            }
            if(cf==2)
            {
                sum=sum+(double) i/Math.pow(a,i);
            }
        }
        System.out.print("sum of series is "+sum);
        sc.close();
    }   
}