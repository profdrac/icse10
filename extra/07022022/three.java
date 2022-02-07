/*
WAP to capitalize starting alphabet of each word
 */
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        int p=0;
        for (int i = 0; i < l; i++) {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p, i);
                System.out.print(Character.toUpperCase(w.charAt(0)));
                System.out.print(w.substring(1,w.length()));
                System.out.print(" ");
                p=i+1;
            }
        }
        sc.close();
    }
}