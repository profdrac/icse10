/*
WAP to show double-letter words from a string
 */
import java.util.Scanner;

public class two {
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
                for(int j=0;j<w.length()-1;j++)
                {
                    if(w.charAt(j)==w.charAt(j+1))
                        System.out.println(w);
                }
                p=i+1;
            }
        }
        sc.close();
    }
}