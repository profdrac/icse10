package class10.chapter1;
import java.util.Scanner;
class c10p59q6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two unequal numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping: a="+a+"\tb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+"\tb="+b);
    }
}