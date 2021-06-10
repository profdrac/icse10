package class10.chapter5;
/**
 * WAP to show tax of a person
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p313q12
{
    public void Tax(String name, int income)
    {
        double t=0;
        if(income<=250000)
            t=0;
        else if(income>250000 && income<=500000)
            t=10*(income-250000)/100;
        else if(income>500000 && income<=1000000)
            t=30000+20*(income-500000)/100;
        else
            t=50000+30*(income-1000000)/100;
        System.out.println("Name = "+name);
        System.out.println("Tax = Rs."+t);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        c10p313q12 o=new c10p313q12();
        System.out.println("Enter name and income");
        String n=sc.next();
        int i = sc.nextInt();
        o.Tax(n,i);
        sc.close();
    }   
}