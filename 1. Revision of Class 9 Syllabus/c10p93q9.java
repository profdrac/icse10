package class10.chapter1;
/**
 * WAP(menu-driven) to calculate area of c.Circle, s.Square and r. Rectangle
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p93q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("[c] Area of Circle");
        System.out.println("[s] Area of Square");
        System.out.println("[r] Area of Rectangle");
        System.out.print("Enter your choice:");
        String ch = sc.next();
        switch(ch)
        {
            case "c":
            case "C":
                System.out.print("Enter radius of the circle:");
                int r = sc.nextInt();
                System.out.println("Area = "+3.14*r*r);
                break;
            case "s":
            case "S":
                System.out.print("Enter side of the square:");
                int s = sc.nextInt();
                System.out.println("Area = "+s*s);
                break;
            case "r":
            case "R":
                System.out.print("Enter length and breadth of the rectangle:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area = "+l*b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }   
}