import java.util.Scanner;

/*
Question 5:
The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book.
The ISBN is based upon a 10-digit code. The ISBN is legal if:

1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 + 6 × digit6 + 7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10 is divisible by 11.

Example : For an ISBN 1401601499
Sum = 1×1 + 2×4 +3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.

Write a program to :
(i) Input the ISBN code as a 10-digit integer.
(ii) If the ISBN is not a 10-digit integer, output the message, “Illegal ISBN” and terminate the program.
(iii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.

If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.
*/
public class icse2013q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN code to be checked: ");
        long isbn = sc.nextLong();
        int count = 0;
        long temp = isbn;
        while(isbn > 0)
        {
            count++;
            isbn /= 10;
        }
        if(count != 10)
        {
            System.out.println("This number is not a valid ISBN as number of digits are not 10");
            System.exit(0);
        }
        isbn = temp;
        int sum = 0;
        while(isbn > 0)
        {
            sum += count * (isbn % 10);
            count--;
            isbn /= 10;
        }
        if(sum % 11 == 0)
        System.out.println("This is a valid ISBN");
        else
        System.out.println("This is not a valid ISBN");
        sc.close();
    }
}
