package class10.chapter4;
/**
 * WAP to abbreviate a string
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p266q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        int l=s.length();
        System.out.print(s.charAt(0));
        for(int i=1;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
                System.out.print(s.charAt(i+1));
        }
        sc.close();
    }   
}