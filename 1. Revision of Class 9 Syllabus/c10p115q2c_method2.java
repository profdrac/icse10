package class10.chapter1;

import java.util.Scanner;

class c10p115q2c_method2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int sum=0;
        int x=0;
        for(int i=1;i<=n;i++)
        {
            x = x+i;
            sum=sum+x;
        }
        System.out.print("Sum of series is "+sum);
        sc.close();
    }   
}