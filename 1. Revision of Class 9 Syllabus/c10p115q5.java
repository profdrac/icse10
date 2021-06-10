package class10.chapter1;
/**
 * WAP to get a number and show product of successors of even digits
 * e.g. 12495 -> 2(3)x4(5) = 20
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p115q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int n=sc.nextInt();
        int pro=1;
        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0)
            {
                rem++;
                pro=pro*rem;
            }
            n=n/10;
        }
        System.out.print("Product of successors is "+pro);
        sc.close();
    }   
}