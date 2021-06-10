package class10.chapter1;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class genPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            int cf=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    cf++;
            }
            if(cf==0)
                System.out.print(i+",");
        }
        sc.close();
    }   
}