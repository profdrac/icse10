package board;

import java.util.Scanner;

/*
Question 7:
Write a menu driven program to accept a number and check and display whether it is a prime number or not
OR an automorphic number or not. (Use switch- case statement)

(a) Prime number: a number is said to be a prime number if it is divisible only by 1 and itself and not by any other number.
Example : 3, 5, 7, 11, 13 etc.,

(b) Automorphic number: An automorphic number is the number which is contained in the last digit(s) of its square.
Example 25 is an automorphic number as its square is 625 and 25 is present as the last two digits.
*/

public class icse2010q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[a] Check Prime");
        System.out.println("[b] Check Automorphic");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int cf = 0;
            for (int i = 1; i <= n; i++) {
                if(n%i == 0)
                cf++;
            }
            if(cf == 2)
            System.out.println("Prime");
            else
            System.out.println("Not Prime");
            break;

            case 'b':
            case 'B':
            System.out.print("Enter number: ");
            n = sc.nextInt();
            int cd = 0, temp = n, sq = n*n;
            while(n>0)
            {
                cd++;
                n /= 10;
            }
            if(sq % Math.pow(10, cd) == temp)
            System.out.println("Automorphic");
            else
            System.out.println("Not Automorphic");
            break;

            default:
            System.out.println("Not an option");
        }
        sc.close();
    }
}
