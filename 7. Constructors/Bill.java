package class10.chapter7;
import java.util.Scanner;
class Bill
{
    int bno, call;
    String name;
    double amt;

    Bill()
    {
        bno=0;
        call=0;
        name="";
        amt=125.0;
    }

    Bill(int b, String n, int c)
    {
        bno=b;
        name=n;
        call=c;
        amt=125.0;
    }

    private void calculate()
    {
        if(call<=100)
            amt=amt+call*0.60;
        else if(call>100 && call<=200)
            amt=amt+100*0.60+(call-100)*0.80;
        else if(call>200 && call<=300)
            amt = amt + 100*0.60 + 100*0.80 + (call-200)*1.20;
        else
            amt = call*1.50;
    }

    private void display()
    {
        System.out.println("Bill\tName\tCalls\tAmount");
        System.out.println(bno+"\t"+name+"\t"+call+"\t"+amt);
    }

    public static void main(String args[])
    {
        Bill o=new Bill(123,"ashu",250);
        o.calculate();
        o.display();
    }
}