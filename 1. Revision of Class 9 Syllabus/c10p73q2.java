package class10.chapter1;
import java.util.Scanner;
class c10p73q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m:");
        int m=sc.nextInt();
        int pt1=2*m;
        int pt2=(int)Math.pow(m,2)-1;
        int pt3=(int)Math.pow(m,2)+1;
        System.out.println(pt1+","+pt2+","+pt3);
    }
}