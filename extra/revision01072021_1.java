/*
WAP to accept a number and check whether the number is palindrome or not by using 
the function named reverse(int n). The function returns the reversed number to the main 
program that checks and shows whether the number is palindrome or not.
*/

import java.util.Scanner;

class revision01072021_1
{
    public int reverse(int n)
    {
        int rev = 0;
        while(n>0)
        {
            rev = rev * 10 + n%10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        revision01072021_1 o = new revision01072021_1();
        System.out.print("Enter number to be checked: ");
        int n = sc.nextInt();
        int r = o.reverse(n);
        if(r == n)
        System.out.print("Number is palindrome");
        else
        System.out.print("Number is not palindrome");
        sc.close();
    }
}