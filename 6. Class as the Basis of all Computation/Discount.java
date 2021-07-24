package class10.chapter6;
/**
 * c10p355q3
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Discount
{
    int cost;
    String name;
    double dc, amt;
    
    private void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter cost:");
        cost=sc.nextInt();
        sc.close();
    }
    
    private void cal()
    {
        if(cost<=5000)
            dc=0;
        else if(cost>5000 && cost<=10000)
            dc=cost*10/100;
        else if(cost>10000 && cost<=15000)
            dc=cost*15/100;
        else
            dc=cost*20/100;
        amt=cost-dc;
    }
    
    private void display()
    {
        System.out.println("Name\tDiscount\tAmount");
        System.out.println(name+"\t"+dc+"\t"+amt);
    }
    
    public static void main(String[] args)
    {
        Discount o = new Discount();
        o.input();
        o.cal();
        o.display();
    }   
}