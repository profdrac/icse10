package class10.chapter3;
/**
 * WAP to to search an array of numbers using Linear Search
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class linearSearchNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        System.out.print("Enter 10 numbers:");
        for(int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched:");
        int x=sc.nextInt();
        int p = -1;
        for(int i=0;i<10;i++)
        {
            if(n[i]==x)
            {
                p=i;
                break;
            }
        }
        if(p>=0)
            System.out.print("Number found at position "+p);
        else
            System.out.print("Number not found");
        sc.close();
    }   
}