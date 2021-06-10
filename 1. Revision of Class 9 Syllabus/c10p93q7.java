package class10.chapter1;
/**
 * WAP to display interest and amount after investing for some time.
 *
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p93q7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sum[principal]:");
        double p=sc.nextDouble();
        System.out.print("Enter time:");
        int t=sc.nextInt();
        System.out.print("Enter age of the person:");
        int age=sc.nextInt();
        //--
        double r;
        if(t==1)
        {
            if(age<60)
                r=7.5;
            else
                r=8.0;
        }
        else if(t==2)
            r=(age<60)?8.5:9.0;
        else if(t==3)
            r=(age<60)?9.5:10.0;
        else
            r=(age<60)?10.0:11.0;
        double i=(p*r*t)/100;
        double amt=p+i;
        //display as table
        System.out.println("Amount\tTerm\tAge\tInt\tFinal");
        System.out.println(p+"\t"+t+"\t"+age+"\t"+i+"\t"+amt);
        sc.close();
    }   
}