/*
WAP to display shortest word of a string/sentence
 */
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        //let us consider length of a longest word
        int lsw=100;
        String sw="";
        //starting position of first alphabet of first word
        int p=0;
        for (int i = 0; i < l; i++) {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p, i);
                if(w.length()<lsw)
                {
                    lsw=w.length();
                    sw=w;
                }
                p=i+1;
            }
        }
        System.out.println("Shortest word is "+sw);
        sc.close();
    }
}