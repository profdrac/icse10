/**
 * WAP to find sum of all even and odd numbers separately, of an array of 20 numbers
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p220q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[20];
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter number "+(i+1)+" ");
            n[i]=sc.nextInt();
        }
        int se=0, so=0;
        for(int i=0;i<20;i++)
        {
            if(n[i]%2==0)
                se = se + n[i];
            else
                so = so + n[i];
        }
        System.out.println("Sum of even numbers is "+se);
        System.out.println("Sum of odd numbers is "+so);
        sc.close();
    }   
}