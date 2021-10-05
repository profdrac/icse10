package class10.chapter4;
/**
   * WAP to replace vowels with *
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p266q7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print("*");
            else
                System.out.print(ch);
        }
        sc.close();
    }   
}