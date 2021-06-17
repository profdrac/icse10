package class10.chapter5;
/**
 * WAP to fun-overload getarea()
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Area
{
    public void getarea(int base,int ht)
    {
        System.out.println("Area of parallelogram "+base*ht);
    }
    
    public void getarea(double d1, double d2)
    {
        System.out.println("Area of rhombus "+0.5*d1*d2);
    }
    
    public void getarea(int a, int b, int h)
    {
        System.out.println("Area of trapezium "+0.5*(a+b)*h);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Area o=new Area();
        o.getarea(7, 8);
        o.getarea(12.5, 13.7);
        o.getarea(23, 19, 25);
        sc.close();
    }   
}