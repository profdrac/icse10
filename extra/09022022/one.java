/*
WAP to show biggest and smallest element in an array of 20 numbers
 */
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[20];
        System.out.print("Enter 20 numbers: ");
        for (int i = 0; i < 20; i++) {
            n[i]=sc.nextInt();
        }
        int b=n[0];
        int s=n[0];
        for (int i = 0; i < 20; i++) {
            if(n[i]>b)
                b=n[i];
            if(n[i]<s)
                s=n[i];
        }
        System.out.println("Biggest number is "+b);
        System.out.println("Smallest number is "+s);
        sc.close();
    }
}