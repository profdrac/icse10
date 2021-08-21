package class10.chapter7;
import java.util.Scanner;
class Laptop 
{
    String name;
    double price;
    double dis;
    double amt;

    Laptop(String n, double p)
    {
        name = n;
        price = p;
    }
    
    private void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the customer and price of the laptop:");
        name = sc.nextLine();
        price = sc.nextDouble();
        sc.close();
    }

    private void compute()
    {
        if(price<=25000)
            dis = price*5/100;
        else if(price>25000 && price<=50000)
            dis = price*7.5/100;
        else if(price>50000 && price<=100000)
            dis = price*10.0/100;
        else
            dis = price*15.0/100;
        amt = price-dis;
    }

    private void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Discount: Rs."+dis);
        System.out.println("Amount: Rs."+amt);
    }

    public static void main(String args[])
    {
        Laptop o1 = new Laptop("", 0);
        o1.input();
        o1.compute();
        o1.display();
    }
}
