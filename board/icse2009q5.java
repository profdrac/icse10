package board;

import java.util.Scanner;

/*
Question 5:
Write a program to generate a triangle or an inverted triangle till n terms based upon the user’s choice of triangle to be displayed.
Example 1:
Input : Type 1 for a triangle and
Type 2,for an inverted triangle
1
Enter the number of terms
5
Output :
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Example 2:
Input : Type 1 for a triangle and
Type 2 for an inverted triangle
2
Enter the number of terms
6
Output :
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

public class icse2009q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for triangle and 2 for inverted triangle: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.print("Enter the number of terms: ");
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            break;

            case 2:
            System.out.print("Enter the number of terms: ");
            t = sc.nextInt();
            for (int i = t; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            break;

            default:
            System.out.println("invalid choice!");
        }
        sc.close();
    }
}
