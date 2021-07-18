/*
Question 5.
Write a program to input a number and check and print whether it is a Pronic number or not.
(Pronic number is the number which is the product of two consecutive integers)

Examples : 12 = 3 × 4 .
20 = 4 × 5
42 = 6 × 7
* @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2018q5 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int n = sc.nextInt();
		int sr = (int) Math.sqrt(n);
		if(sr*(sr+1) == n)
			System.out.println("Number is pronic");
		else
			System.out.println("Number is not pronic");
		sc.close();
	}
}
