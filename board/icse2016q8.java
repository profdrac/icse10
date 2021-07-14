import java.util.Scanner;

/*
Question 8:

Write a program to accept a number and check and display whether it is a Niven number or not.
(Niven number is that number which is divisible by its sum of digits).

Example:
Consider the number 126.
Sum of its digits is 1+2+6 = 9 and 126 is divisible by 9.
*/

class icse2016q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int t = n, sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        if(t%sum == 0)
        System.out.println("Number is Niven");
        else
        System.out.println("Number is not Niven");
        sc.close();
    }
}