package class10.chapter1;
import java.util.Scanner;
class c10p59q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of voters:");
        long tv=sc.nextLong();
        long pv=tv*80/100;
        long vx=pv*60/100;
        long vy=pv-vx;
        System.out.println("Voters of X="+vx);
        System.out.println("Voters of Y="+vy);
    }
}