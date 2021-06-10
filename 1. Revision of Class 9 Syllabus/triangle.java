package class10.chapter1;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character using which triangle is to be made:");
        String c=sc.next();
        System.out.print("What should be the dimensions of the triangle?");
        int d=sc.nextInt();
        for(int i=d;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
        sc.close();
    }   
}