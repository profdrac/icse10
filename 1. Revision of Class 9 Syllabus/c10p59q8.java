package class10.chapter1;
import java.util.Scanner;
class c10p59q8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter co-ordinates pair:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double m=(double)(y2-y1)/(x2-x1);
        System.out.println("Slope of the line is "+m);
    }
}