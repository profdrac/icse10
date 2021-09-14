package class10.chapter4;
/**
 * WAP to show no of words and letters in a string
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c10p266q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String s=sc.nextLine();
        int l = s.length(); //10
        int cs=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i); //l
            if(ch==' ')
                cs++; //1
        }
        System.out.println("Number of words are "+(cs+1));
        System.out.println("Number of letters are "+(l-cs));
        sc.close();
    }   
}
