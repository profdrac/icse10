package class10.chapter1;
/**
 * WAP to get a 2-digit number and see whether it is special or not.
 * (if sum-of-digits + product-of-digits==number)
 *
 * @author (Ashutosh Sharma)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class c10p92q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a two-digit number:");
        int n=sc.nextInt(); //n=84
        if(n>9 && n<100)
        {
            int d1=n/10;    //8
            int d2=n%10;    //4
            if((d1+d2)+(d1*d2)==n)
                System.out.println("Number is Special");
            else
                System.out.println("Number is not Special");
        }
        else
            System.out.println("Eye check-up?");
    }   
}