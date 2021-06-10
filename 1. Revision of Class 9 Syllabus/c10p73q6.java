package class10.chapter1;
import java.util.Scanner;
class c10p73q6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a,b and c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int dis=b*b-4*a*c;
        System.out.println(dis);
    }
}