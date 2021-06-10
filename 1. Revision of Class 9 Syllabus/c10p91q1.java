package class10.chapter1;
/**
 * WAP to get 3 numbers and display greatest (also types of numbers)
 *
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p91q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+ " is greatest");
        else if(b>a && b>c)
            System.out.println(b+ " is greatest");
        else if(c>a && c>b)
            System.out.println(c+ " is greatest");
        else
            System.out.println("Equal numbers");
            
        if(a>0 && b>0 && c>0)
            System.out.println("Numbers are +ve");
        else if(a<0 && b<0 && c<0)
            System.out.println("Numbers are -ve");
        else if(a==0 && b==0 && c==0)
            System.out.println("Numbers are zeroes");
        else
            System.out.println("Numbers are mixed");
        sc.close();
    }   
}