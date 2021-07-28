package class10.chapter6;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Mobike
{
    int bno, phno, days, charge;
    String name;
    
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter bikeno:");
        bno=sc.nextInt();
        System.out.print("Enter phone no:");
        phno=sc.nextInt();
        System.out.print("Enter days for which bike was taken on rent:");
        days=sc.nextInt();
        sc.close();
    }
    
    public void compute()
    {
        if(days<=5)
            charge=days*500;
        else if(days>5 && days<=10)
            charge=5*500+(days-5)*400;
        else
            charge=5*500+5*400+(days-10)*200;
    }
    
    public void display()
    {
        System.out.println("BikeNo\tPhone\tName\tDays\tCharge");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }
    
    public static void main(String[] args)
    {
        Mobike o = new Mobike();
        o.input();
        o.compute();
        o.display();
    }   
}