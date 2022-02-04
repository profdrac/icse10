import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        s = ' '+s;
        int l=s.length();
        for(int i=0;i<l-1;i++) {
            if (s.charAt(i) == ' ')
                System.out.print(s.charAt(i + 1));
        }
        sc.close();
    }
}