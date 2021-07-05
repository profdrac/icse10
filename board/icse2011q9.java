package board;

import java.util.Scanner;

/*
Question 9:
Write a menu driven program to perform the following: (Use switch-case statement)

(a) To print the series 0, 3, 8, 15, 24, …… n terms (value of ‘n’ is to be an input by the user).
(b) To find the sum of the series given below :
S = 1/2 + 3/4 + 5/6 + 7/8 + ……… 19/20.
*/

public class icse2011q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[a] Print the series 0, 3, 8, 15, 24, …… n terms");
        System.out.println("[b] Find sum of series 1/2 + 3/4 + 5/6 + 7/8 + ……… + 19/20");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
            System.out.print("Enter range: ");
            int n = sc.nextInt();
            for (int i = 1; i < n; i++) {
                int value = (i*i) - 1;
                if(value > n)
                break;
                System.out.print(value + ", ");
            }
            break;

            case 'b':
            case 'B':
            double sum = 0;
            for (int i = 1; i <= 19; i += 2)
                sum += (double) i/(i+1);
            System.out.println("Sum of series is " + sum);
            break;

            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }    
}
