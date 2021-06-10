package class10.chapter1;
import java.util.Scanner;
class c10_sumOfFactorials
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int f=1;
            for(int j=i;j>=1;j--)
            {
                f=f*j;
            }
            sum+=f;
        }
        System.out.println("Sum of series is "+sum);
        sc.close();
    }
}