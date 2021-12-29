package class10.chapter3;
/**
 * WAP to search a number in an array of 10 numbers (using Binary Search)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class binarySearchNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[] = new int[10];
        System.out.print("Enter 10 numbers:");
        for(int i=0;i<10;i++)
            n[i]=sc.nextInt();
        System.out.print("Enter number to be found:");
        int x = sc.nextInt();
        int p=-1;
        int lb=0, ub=9;
        while(lb<=ub)
        {
            int cb=(lb+ub)/2;
            
            if(n[cb]>x)
                ub = cb-1;
            else if(n[cb]<x)
                lb = cb+1;
            else
            {
                p=cb;
                break;
            }
        }
        if(p>=0)
            System.out.println("Number found at position "+p);
        else
            System.out.println("Number not found");
        sc.close();
    }   
}