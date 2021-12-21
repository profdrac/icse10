package class10.chapter3;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p220q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int f[]=new int[20];
        System.out.print("Enter 20 temps: ");
        for(int i=0;i<20;i++)
            f[i]=sc.nextInt();
        for(int i=0;i<20;i++)
        {
            double c= ((f[i]-32)*5)/9;
            System.out.println(c);
        }
        sc.close();
    }   
}