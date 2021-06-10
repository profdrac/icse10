package class10.chapter1;
import java.util.Scanner;
class c10p59q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total seconds:");
        int s=sc.nextInt();
        int h=s/3600;
        s=s%3600;
        int m=s/60;
        s=s%60;
        System.out.println(h+" Hours, "+m+" Minutes, "+s+" Seconds");
    }
}