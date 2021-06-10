package class10.chapter1;

import java.util.Scanner;

class c10p115q2b
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range: ");
        int n=sc.nextInt();
        int flag=0;
        int sum=0;
        for(int i=2;i<=n;i+=2)
        {
            if(flag==0)
            {
                sum=sum+i;
                flag=1;
            }
            else
            {
                sum=sum-i;
                flag=0;
            }
        }
        System.out.println("Sum of series is "+sum);
        sc.close();
    }
}