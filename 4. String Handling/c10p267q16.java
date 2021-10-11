package class10.chapter4;
/**
 * WAP to show frequnecy of chars in alpha order
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p267q16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        for(int i=65;i<=90;i++)     //run a loop on A-Z
        {
            int c=0;
            for(int j=0;j<l;j++)
            {
                char ch=s.charAt(j);
                int ac=ch;
                if(ac==i)
                    c++;
            }
            if(c!=0)
                System.out.println((char)i+" = "+c);
        }
        sc.close();
    }   
}