package class10.chapter7;
import java.util.Scanner;
class Grade_Revision
{
    String name;
    int bas, expn;
    double inc, nbas;
    
    Grade_Revision()
    {
        name="";
        bas=0;
        expn=0;
        inc=0;
        nbas=0;
    }
    
    private void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter Basic Salary:");
        bas=sc.nextInt();
        System.out.print("Enter years of experience:");
        expn=sc.nextInt();
        sc.close();
    }
    
    private void increment()
    {
        if(expn<=3)
            inc=1000+bas*10/100;
        else if(expn>3 && expn<=5)
            inc=3000+bas*12/100;
        else if(expn>5 && expn<=10)
            inc=5000+bas*15/100;
        else
            inc=8000+bas*20/100;
        nbas=bas+inc;
    }
        
    private void display()
    {
        System.out.println("Name="+name);
        System.out.println("New Salary= ₹"+nbas);
    }
    
    public static void main(String args[])
    {
        Grade_Revision o=new Grade_Revision();
        o.accept();
        o.increment();
        o.display();
    }
}
