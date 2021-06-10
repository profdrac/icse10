package class10.chapter1;
import java.util.Scanner;
class c10p59q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter printed price : Rs");
        double pp=sc.nextDouble();
        double dis=pp*10/100;
        double amt=pp-dis;
        double gst=amt*9/100;
        amt=amt+gst;
        System.out.println("Amount to be paid is Rs."+amt);
    }
}