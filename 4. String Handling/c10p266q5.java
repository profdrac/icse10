package class10.chapter4; 
/**
 * WAP to show longest word and its length
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p266q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence:");        
        String s=sc.nextLine();
        s=s+' ';
        int l=s.length();
        //----------
        String lw="";
        int llw=0;
        //----------
        int p=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p,i);
                if(w.length()>llw)
                {
                    lw=w;
                    llw=w.length();
                }
                p=i+1;
            }
        }
        System.out.println(lw+" is the longest word with length "+llw);
        sc.close();
    }   
}