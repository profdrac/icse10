package class10.chapter1;
/**
 * WAP to display reverse of digits of a no in new lines
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class revDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits is "+sum);
        sc.close();
    }   
}