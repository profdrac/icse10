package board;

import java.util.Scanner;

/*
Question 9:
Write a program to calculate and print the sum of each of the following series:

Sum (S) = 2 - 4 + 6 - 8 + ----- - 20
Sum (S) = x/2 + x/5 + x/8 + -------- + x/20

(Value of x to be input by user)
*/

public class icse2008q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[a] Sum of first series");
        System.out.println("[b] Sum of second series");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
            int sum = 0, s = 1;
            for (int i = 1; i <= 10; i++) {
                sum += 2*i*s;
                s = s*-1;
            }
            System.out.println("Sum is " + sum);
            break;
            case 'b':
            case 'B':
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            double sum2 = 0;
            for (int i = 2; i <= 20; i+=3)
                sum2 += (double) (x/i);
            System.out.println("Sum is " + sum2);
            break;
            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }    
}
