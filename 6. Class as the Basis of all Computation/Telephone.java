package class10.chapter6;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Telephone
{
    int prv, pre, call;
    String name;
    double amt, total;
    
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter number of previous calls:");
        prv=sc.nextInt();
        System.out.print("Enter number of present calls:");
        pre=sc.nextInt();
        sc.close();
    }
    
    public void cal()
    {
        amt=180;
        call=pre-prv;
        if(call<=100)
            total=amt;
        else if(call>100 && call<=200)
            total=amt+call*90/100;
        else if(call>200 && call<=400)
            total=amt+call*80/100;
        else
            total=amt+call*70/100;
    }
    
    public void display()
    {
        System.out.println("Name\tCalls\tAmount");
        System.out.println(name+"\t"+call+"\t"+total);
    }
    
    public static void main(String[] args)
    {
        Telephone o = new Telephone();
        o.input();
        o.cal();
        o.display();
    }   
}