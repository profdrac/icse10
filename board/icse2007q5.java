package board;

import java.util.Scanner;

/*
Write a program to compute and display the sum of the following series:
1+2/1x2 + 1+2+3/1x2x3 + ------ + 1+2+3+---n/1x1x3x---n
*/
public class icse2007q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        double s = 0;
        double num = 1, den = 1;
        for (int i = 2; i <= n; i++) {
            num += i;
            den*= i;
            s += num/den;
        }
        System.out.println("Sum of series upto "+n+" is "+s);
        sc.close();
    }
}
