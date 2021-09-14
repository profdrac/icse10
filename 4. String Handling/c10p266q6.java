package class10.chapter4;

//WAP to show all characters along with their ASCII codes one by one
import java.util.Scanner;

class c10p266q6
{
    public static void main()
    {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        int l = s.length();
        for(int i=0; i<l; i++)
        {
            char ch = s.charAt(i);
            int ac = ch;
            System.out.println("ASCII of "+ch+" = "+ac);
        }
        sc.close();
    }
}