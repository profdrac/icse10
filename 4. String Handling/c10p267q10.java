package class10.chapter4; 
/**
 * WAP to show words in reverse (position)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p267q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        s=' '+s;
        // hello world
        int l=s.length();
        int p = l;
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(i+1,p);
                System.out.print(w+" ");
                p = i;
            }
        }
        sc.close();
    }   
}