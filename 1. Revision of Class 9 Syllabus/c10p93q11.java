package class10.chapter1;
/**
 * WAP(menu-driven) to calculate relative-velocities and time taken by two trains to cross each other. 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p93q11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter velocities of both trains(km/h):");
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        System.out.print("Enter lengths of both trains(m):");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        System.out.print("is the direction same or opposite? Choose [1]-same, [2]-Opposite");
        int ch=sc.nextInt();
        int s=0;
        switch(ch)
        {
            case 1:
                s=Math.abs((v1-v2)*5/18);
                break;
            default:
                s=(v1+v2)*5/18;
        }
        int d=l1+l2;
        double t=(double) d/s;
        System.out.println("Relative Velocity = "+s+"m/s");
        System.out.println("Time to cross = "+t+"s");
        sc.close();
    }   
}