/**
 * WAP to show greatest number of an array of 10 nos
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class highest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[] = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a no:");
            n[i]=sc.nextInt();
        }
        int g=n[0];
        for(int i=0;i<10;i++)
        {
            if(n[i]>g)
                g=n[i];
        }
        System.out.print("The greatest no is "+g);
        sc.close();
    }   
}