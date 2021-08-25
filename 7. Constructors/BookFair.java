package class10.chapter7;
import java.util.Scanner;
class BookFair
{
    String Bname;
    double price;
    
    BookFair()
    {
        Bname="";
        price=0;
    }
    
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price:");
        price=sc.nextDouble();
        System.out.print("Enter book name:");
        Bname=sc.next();
        sc.close();
    }
    
    public void calculate()
    {
        if(price<=1000)
            price=price-2*price/100;
        else if(price>1000 && price<=3000)
            price=price-10*price/100;
        else
            price=price-15*price/100;
    }
    
    public void display()
    {
        System.out.println("Name = "+Bname);
        System.out.println("Price = Rs."+price);
    }
    
    public static void main(String[] args)
    {
        BookFair o=new BookFair();
        o.input();
        o.calculate();
        o.display();
    }   
}