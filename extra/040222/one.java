import java.util.Locale;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int l=s.length();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<l-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                count++;
        }
        System.out.println("There are "+count+" double letters");
        sc.close();
    }
}