package class10.chapter3;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p220q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            n[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(n[i]<0)
                System.out.print(n[i]+", ");
        }
        for(int i=0;i<10;i++)
        {
            if(n[i]>0)
                System.out.print(n[i]+", ");
        }
        sc.close();
    }   
}