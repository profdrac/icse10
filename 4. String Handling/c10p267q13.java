package class10.chapter4;
/**
 * WAP to replace vowels with the character(s) following it
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p267q13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word:");
        String s=sc.next();
        s=s.toLowerCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
            {
                ch++;
            }
            System.out.print(ch);
        }
        sc.close();
    }   
}