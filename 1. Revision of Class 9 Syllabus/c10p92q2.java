package class10.chapter1;
/**
 * WAP to get sides of a triangle and find if it is Equable or not.
 * (if area == perimeter), area = (b*h)/2 and peri=b+h+l
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p92q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base, height and length:");
        int b=sc.nextInt();
        int h=sc.nextInt();
        int l=sc.nextInt();
        int a=(b*h)/2;
        int p=b+h+l;
        if(a==p)
            System.out.println("Triangle is Equable");
        else
            System.out.println("Triangle is Not Equable");
        sc.close();
    }
}
