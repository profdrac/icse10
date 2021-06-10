package class10.chapter5;
/**
 * WAP to print LCM of 2 nos using Glcm(int, int)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p312q7
{
    public void Glcm(int a, int b)
    {
        int gcd=1;
        int m=Math.min(a,b);
        for(int i=1;i<=m;i++)
        {
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        int lcm=(a*b)/gcd;
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p312q7 o=new c10p312q7();
        System.out.print("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        o.Glcm(a,b);
        sc.close();
    }   
}