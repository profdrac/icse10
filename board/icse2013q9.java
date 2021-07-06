import java.util.Scanner;

/*
Question 9:
Using the switch statement, write a menu driven program :

(i) To check and display whether a number input by the user is a composite number or not
(A number is said to be a composite, if it has one or more than one factor excluding 1 and the number itself).
Example : 4, 6, 8, 9

(ii) To find the smallest digit of an integer that is input.
Sample inputs: 6524
Sample output: Smallest digit is 2

For an incorrect choice, an appropriate error message should be displayed
*/

public class icse2013q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Check whether a number is composite");
        System.out.println("[2] Find smallest digit of a number");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if( n%i == 0)
                count++;
            }
            if(count != 2)
            System.out.println("Number is composite");
            else
            System.out.println("Number is prime");
            break;

            case 2:
            System.out.print("Enter the number: ");
            n = sc.nextInt();
            int small = 9;
            while(n>0)
            {
                if(n%10 < small)
                small = n%10;
                n /= 10;
            }
            System.out.println("Smallest digit is " + small);
            break;

            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
