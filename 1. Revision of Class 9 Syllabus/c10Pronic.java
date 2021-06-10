package class10.chapter1;
/**
 * WAP to check whether given no is Pronic or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Pronic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sq=(int) Math.sqrt(n);
        if(sq*(sq+1)==n)
            System.out.print("Pronic");
        else
            System.out.print("!Pronic");
        sc.close();
    }   
}