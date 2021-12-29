package class10.chapter3;
/**
 * WAP to to search an array of strings using Linear Search
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class linearSearchString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[10];
        System.out.print("Enter 10 names:");
        for(int i=0;i<10;i++)
        {
            n[i]=sc.next();
        }
        System.out.print("Enter the name to be searched:");
        String x=sc.next();
        int p = -1;
        for(int i=0;i<10;i++)
        {
            if(n[i].equals(x))
            {
                p=i;
                break;
            }
        }
        if(p>=0)
            System.out.print("Name found at position "+p);
        else
            System.out.print("Name not found");
        sc.close();
    }   
}