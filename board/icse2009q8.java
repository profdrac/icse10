package board;

import java.util.Scanner;

/*
Question 8:
Write a menu driven program to accept a number from the user and check whether it is a ‘BUZZ’ number 
or to accept any two numbers and print the ‘GCD’ of them.

(a) A BUZZ number is the number which either ends with 7 or divisible by 7.

(b) GCD (Greatest Common Divisor) of two integers is calculated by continued division method.
Divide the larger number by the smaller; the remainder then divides the previous divisor.
The process is repeated till the remainder is zero. The divisor then results the GCD. [
*/

public class icse2009q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[a] Check a number for BUZZ");
        System.out.println("[b] Find GCD of two numbers");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
            System.out.println("Enter number to be checked: ");
            int n = sc.nextInt();
            if(n % 7 == 0 || n % 10 == 7)
            System.out.println("BUZZ");
            else
            System.out.println("Not BUZZ");
            break;

            case 'b':
            case 'B':
            System.out.println("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int gcd = 1;
            for(int i=1; i<=Math.min(x, y); i++)
            {
                if(x % i == 0 && y % i == 0)
                gcd = i;
            }
            System.out.println("GCD is "+gcd);
            break;

            default:
            System.out.println("Not a choice!");
        }
        sc.close();
    }
}
