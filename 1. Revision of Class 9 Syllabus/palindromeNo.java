package class10.chapter1;
/**
 * WAP to reverse a no
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class palindromeNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        long n=sc.nextLong();
        long rev=0,temp=n;
        while(n>0)
        {
            long rem=n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        if(rev==temp)
            System.out.print("Palindrome");
        else
            System.out.print("!Palindrome");
        sc.close();
    }   
}