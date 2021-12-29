package class10.chapter3;
/**
 * WAP to find a name in an array of 10 names (using Binary Search)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class binarySearchString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n[] = new String[10];
        System.out.println("Enter 10 names:");
        for(int i=0;i<10;i++)
            n[i] = sc.next();
        System.out.println("Enter name to be found:");
        String x = sc.next();
        int p=-1;
        int lb=0,ub=9;
        while(lb<=ub)
        {
            int cb=(lb+ub)/2;
            if(n[cb].compareTo(x)>0)
                ub = cb-1;
            else if(n[cb].compareTo(x)<0)
                lb = cb+1;
            else
            {
                p=cb;
                break;
            }
        }
        if(p>=0)
            System.out.println("name found at position "+p);
        else
            System.out.println("name not found");
        sc.close();
    }   
}