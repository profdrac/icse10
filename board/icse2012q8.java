package board;

import java.util.Scanner;

/*
Question 8:
Using the switch statement, write a menu driven program to :

(i) Generate and display the first 10 terms of the Fibonacci series 0, 1, 1, 2, 3, 5…..
The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two.

(ii) Find the sum of the digits of an integer that is input.

Sample Input: 15390
Sample Output : Sum of the digits =18
For an incorrect choice, an appropriate error message should be displayed
*/

public class icse2012q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] First ten terms of fibonacci");
        System.out.println("[2] Sum of digits of an integer");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            int a = 0, b = 1, c;
            System.out.print(a+" "+b+" ");
            for (int i = 0; i < 8; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            break;

            case 2:
            System.out.print("Enter a multi-digit number: ");
            int n = sc.nextInt();
            int sum = 0;
            while(n>0)
            {
                sum += n%10;
                n /= 10;
            }
            System.out.println("Sum of digits is "+sum);
            break;

            default:
            System.out.println("Invalid choice!");
        }
        sc.close();        
    }
}
