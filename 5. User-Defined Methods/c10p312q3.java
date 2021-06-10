package class10.chapter5;
/**
 * WAP to show whether given no is pronic or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p312q3
{
    public int Pronic(int n)
    {
        int sq=(int) Math.sqrt(n);
        if(sq*(sq+1)==n)
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p312q3 o=new c10p312q3();
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int res=o.Pronic(n);
        if(res==1)
            System.out.print("Number is Pronic");
        else
            System.out.print("Number is not Pronic");
        sc.close();
    }   
}