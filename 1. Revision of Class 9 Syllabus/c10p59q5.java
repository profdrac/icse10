
package class10.chapter1;
import java.util.Scanner;
class c10p59q5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int t1=240/60;
        int t2=240/(60-20);
        int t=t1+t2;
        int avg=480/t;
        System.out.println("Total time= "+t+" Hours");
        System.out.println("Average Speed= "+avg+" km/h");
    }
}