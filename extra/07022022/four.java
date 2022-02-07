/*
WAP to print all the special words from a string
 */
import java.util.Locale;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        int p=0;
        for (int i = 0; i < l; i++) {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p, i);
                w=w.toLowerCase();
                int lw=w.length();
                if(w.charAt(0)==w.charAt(lw-1))
                    System.out.println(w);
                p = i+1;
            }
        }
        sc.close();
    }
}