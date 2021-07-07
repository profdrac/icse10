import java.util.Scanner;

/*
Question 5:
A special two-digit number is such that when the sum of its digits is added to the product of its digits,
the result is equal to the original two-digit number. Example: Consider the number 59.

Sum of digits = 5 + 9=14
Product of its digits = 5 x 9 = 45

Sum of the sum of digits and product of digits = 14 + 45 = 59

Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
If the value is equal to the number input, output the message “Special 2-digit number” otherwise,
output the message “Not a special 2-digit number”.
*/

public class icse2014q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int n = sc.nextInt();
        if(n>9 && n <100)
        {
            int d1 = n/10;
            int d2 = n%10;
            if( (d1 + d2) + (d1 * d2) == n)
            System.out.println("It is a two digit special number");
            else
            System.out.println("It is not a two digit special number");
        }
        else
        System.out.println("This number is not having 2 digits!");
        sc.close();
    }
}
