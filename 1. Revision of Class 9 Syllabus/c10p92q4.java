package class10.chapter1;
/**
 * WAP to determine the nature and roots of a quadratic equation.
 * (if discriminant is > 0, roots are real, else imaginary)
 * 
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p92q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of a,b and c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        if(d<=0)
            System.out.println("Roots are imaginary");
        else
        {
            System.out.println("Roots are real");
            double r1=(-b+Math.sqrt(d))/2*a;
            double r2=(-b-Math.sqrt(d))/2*a;
            System.out.println("Root 1="+r1);
            System.out.println("Root 2="+r2);
        }
        sc.close();
    }   
}
