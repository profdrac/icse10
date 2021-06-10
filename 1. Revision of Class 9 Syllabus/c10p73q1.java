package class10.chapter1;
import java.util.Scanner;
class c10p73q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a,b and c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long sum=Math.round((double)(1/Math.pow(a,2)+(double)(2/Math.pow(b,2))+(double)(3/Math.pow(c,2))));
        System.out.println(sum);
    }
}