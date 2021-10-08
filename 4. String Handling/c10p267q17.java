package class10.chapter4;
/**
 * WAP to get a string and count double letters in it
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p267q17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                c++;
        }
        System.out.println("Double letters are "+c);
        sc.close();
    }   
}