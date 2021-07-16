/*
 *Question 5.
Write a program to accept a number and check and display whether it is a spy number or not.
(A number is spy if the sum of its digits equals the product of its digits.)

Example : consider the number 1124
Sum of the digits = l + l+ 2 + 4 = 8
Product of the digits = 1×1 x2x4 = 8
 */

import java.util.Scanner;

class icse2017q5{

	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0, pro = 1;
		while(n>0){
			int rem = n%10;
			sum += rem;
			pro *= rem;
			n /= 10;
		}
		if(sum == pro)
			System.out.println("Spy number");
		else
			System.out.println("Not a Spy number");
		sc.close();
	}
}
