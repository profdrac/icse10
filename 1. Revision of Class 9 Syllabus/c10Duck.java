package class10.chapter1;
/**
 * WAP to check whether given no is duck or not
 * if any digit is 0
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Duck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        boolean isDuck=false;
        while(n>0)
        {
            int rem=n%10;
            if(rem==0) 
            {
                isDuck=true;
                break;
            }
            n=n/10;
        }
        if(isDuck==true)
            System.out.print("Duck no");
        else
            System.out.print("!Duck no");
        sc.close();
    }   
}