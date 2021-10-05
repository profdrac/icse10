package class10.chapter4;
/**
 * WAP to get a string and show the string after removing vowels
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p266q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U')
                continue;
            System.out.print(ch);
        }
        sc.close();
    }   
}