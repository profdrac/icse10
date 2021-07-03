package board;

import java.util.Scanner;

/*
Question 7:
Write a menu driven class to accept a number from the user and check whether it is a Palindrome or a Perfect number.
(a) Palindrome number— (a number is a Palindrome which when read in reverse order is same as read in the right order)
Example : 11, 101, 151 etc.
(b) Perfect number— (a number is called Perfect if it is equal to the sum of its factors other than the number itself.)
Example : 6 = 1 + 2 + 3
*/

public class icse2008q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("[a] Check Palindrome Number");
        System.out.println("[b] Check Perfect Number");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
            System.out.println("Enter number to be checked: ");
            int n = sc.nextInt();
            int rev = 0, temp = n;
            while(n>0) 
            {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            if(rev == temp)
            System.out.println("Palindrome Number");
            else
            System.out.println("Not a Palindrome Number");
            break;
            case 'b':
            case 'B':
            System.out.println("Enter number to be checked: ");
            n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if(n % i == 0)
                sum += i;
            }
            if(sum == n)
            System.out.println("Perfect Number");
            else
            System.out.println("Not a Perfect Number");
            break;
            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }    
}
