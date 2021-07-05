package board;

import java.util.Scanner;

/*
Question 6:
Write a program to input a number and print whether the number is a special number or not.

(A number is. said to be a special number, if the sum of the factorial of the digits of the number is same as the original number).
Example : 145 is a special number, because 1!+4!+5! = 1 + 24 + 120 = 145 (Where ! stands for factorial of the number and
the factorial value of a number is the product of all integers from 1 to that number, example 5! = 1*2*3*4*5 = 120).
*/

public class icse2011q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked: ");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(n>0)
        {
            int rem = n%10;
            int fact = 1;
            for (int i = rem; i > 1; i--)
            fact *= i;
            sum += fact;
            n /= 10;
        }
        if(sum == temp)
        System.out.println("Special number");
        else
        System.out.println("Not a Special number");
        sc.close();
    }    
}
