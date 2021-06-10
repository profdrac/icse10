package class10.chapter1;
import java.util.Scanner;
class c10p73q5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angles A and B:");
        int A=sc.nextInt();
        int B=sc.nextInt();
        double Ar=(22.0/(7*180))*A;
        double Br=(22.0/(7*180))*B;
        double res=(Math.tan(Ar)-Math.tan(Br))/(1+Math.tan(Ar)*Math.tan(Br));
        System.out.println("Result="+res);
    }
}