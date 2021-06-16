package class10.chapter5;
/**
 * WAP to fun-overload area()
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p312q6
{
    public void area(int r)
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }
    
    public void area(float side)
    {
        System.out.println("Area of square is "+side*side);
    }
    
    public void area(int l, int b)
    {
        System.out.println("Area of rectangle is "+l*b);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p312q6 o=new c10p312q6();
        System.out.println("+---MENU--------------+");
        System.out.println("[1] Area of Circle");
        System.out.println("[2] Area of Square");
        System.out.println("[3] Area of Rectangle");
        System.out.println("+---------------------+");
        System.out.println("Which area do you want to find out? ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("What is the radius? ");
                int r=sc.nextInt();
                o.area(r);
                break;
            case 2:
                System.out.print("What is the side of square? ");
                float s=sc.nextFloat();
                o.area(s);
                break;
            case 3:
                System.out.print("What are the values of length & breadth? ");
                int l=sc.nextInt();
                int b=sc.nextInt();
                o.area(l,b);
                break;
           default:
                System.out.print("Are you blind?");
        }
        sc.close();
    }   
}