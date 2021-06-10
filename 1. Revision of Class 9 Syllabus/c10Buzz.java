package class10.chapter1;
/**
 * WAP to find whether given no is buzz or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Buzz
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to be checked:");
        int n=sc.nextInt();
        if(n%10==7 || n%7==0)
            System.out.print(n+" is Buzz");
        else
            System.out.print(n+" is !Buzz");
        sc.close();
    }   
}