package class10.chapter5;
/**
 * WAP to ---------
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p312q4
{
    public void fact(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+", "+n/i);
                break;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p312q4 o=new c10p312q4();
        System.out.println("Enter no:");
        int n=sc.nextInt();
        o.fact(n);
        sc.close();
    }   
}