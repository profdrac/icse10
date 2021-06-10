package class10.chapter1;
/**
 * WAP to check whether a no is disarium or not e.g. 135
 * 1^1+3^2+5^3==135
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10Disarium
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        int cd=0,temp=n,sum=0;
        while(n>0)
        {
            cd++;
            n=n/10;
        }
        n=temp;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+(int) Math.pow(rem,cd); 
            cd--;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Disarium no");
        else
            System.out.println("!Disarium no");
        sc.close();
        System.out.print(Math.rint(8.4));
    }   
}