package class10.chapter5;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p312q5
{
    public int fact(int n)
    {
        int f=1;
        for(int i=n;i>1;i--)
            f=f*i;
        return f;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p312q5 o=new c10p312q5();
        System.out.print("Enter values of n and m:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        double S=(double) o.fact(n)/(o.fact(m)*o.fact(n-m));
        System.out.println("S="+S);
        sc.close();
    }   
}