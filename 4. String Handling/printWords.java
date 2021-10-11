package class10.chapter4;
/**
 * WAP to 
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class printWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        s=s+' ';
        int l=s.length();
        int p=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p,i);
                System.out.println(w);
                p=i+1;
            }
        }
        sc.close();
    }   
}