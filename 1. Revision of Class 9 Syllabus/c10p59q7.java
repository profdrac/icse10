package class10.chapter1;
import java.util.Scanner;
class c10p59q7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount:");
        double p=sc.nextDouble();
        double a=p*(1+(6.0/100.0))*(1+(8.0/100.0))*(1+(10.0/100.0));
        double ci=a-p;
        System.out.println("Amount after 3 years = Rs."+a);
        System.out.println("Compound Interest= Rs."+ci);
    }
}