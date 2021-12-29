package class10.chapter3;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class p221q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[] = new int[20];
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            n[i]=sc.nextInt();
        }
        for(int i=0;i<20;i++)
        {
            int cur = n[i];
            int c=0;
            for(int j=1;j<=cur;j++)
            {
                if(cur%j==0)
                    c++;
            }
            if(c==2)
                System.out.println(n[i]+" is prime");
        }
        sc.close();
    }   
}