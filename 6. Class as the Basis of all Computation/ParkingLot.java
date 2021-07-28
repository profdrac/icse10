package class10.chapter6;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class ParkingLot
{
    int vno, hours;
    double bill;
    
    private void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter vehicle-no:");
        vno=sc.nextInt();
        System.out.print("Enter number of hours [whole no]:");
        hours=sc.nextInt();
        sc.close();
    }
    
    private void calculate()
    {
        bill=3+(hours-1)*1.50;
    }
    
    private void display()
    {
        System.out.println("Vehicle No:"+vno);
        System.out.println("Parking Time:"+hours);
        System.out.println("Bill: Rs."+bill);
    }
    
    public static void main(String[] args)
    {
        ParkingLot o = new ParkingLot();
        o.input();
        o.calculate();
        o.display();
    }   
}