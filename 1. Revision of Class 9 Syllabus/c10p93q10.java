package class10.chapter1;
/**
 * WAP(menu-driven) to calculate voulme of a.Cube, b.Sphere and c. Cuboid
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p93q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("[a] Volume of Cube");
        System.out.println("[b] Volume of Sphere");
        System.out.println("[c] Volume of Cuboid");
        System.out.print("Enter your choice:");
        String ch = sc.next();
        switch(ch)
        {
            case "a":
            case "A":
                System.out.print("Enter side of the cube:");
                int s = sc.nextInt();
                System.out.println("Volume = "+s*s*s);
                break;
            case "b":
            case "B":
                System.out.print("Enter radius of the sphere:");
                int r = sc.nextInt();
                System.out.println("Volume = "+4/3*3.14*r*r*r);
                break;
            case "c":
            case "C":
                System.out.print("Enter length, breadth and height of the cuboid:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("Volume = "+l*b*h);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }   
}