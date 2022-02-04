import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=91)
                System.out.print((char) (ch+32));
            else if(ch>=97 && ch<=122)
                System.out.print((char) (ch-32));
            else
                System.out.print(ch);
        }
        sc.close();
    }
}